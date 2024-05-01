package com.kibobazar.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kibobazar.app.entity.Cliente;
import com.kibobazar.app.repository.ClienteRepository;
import com.kibobazar.app.service.ClienteService;


@Service
public class ClienteServiceImpl implements ClienteService {

	ClienteRepository clienteRepository;
	
	public ClienteServiceImpl(ClienteRepository clienteRepository) {
	this.clienteRepository = clienteRepository;
	}
	
	@Override
	public Cliente getClienteById(Long id) {
		Optional<Cliente> clienteOptional = clienteRepository.findById(id);
		Cliente existingCliente;
		
		if( clienteOptional.isPresent() ) {
			existingCliente = clienteOptional.get();
			return existingCliente;
		} else {
			throw new IllegalStateException("User does not exist with id " + id);
		}
	}

	@Override
	public Cliente getClienteByCorreo(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente createCliente(Cliente cliente) {
		cliente.setActive(true);
		cliente.setId(null);
		
		//TODO encriptar password
		
		if(clienteRepository.existsByCorreo(cliente.getCorreo())) {
			throw new IllegalStateException("User exist with email " + cliente.getCorreo());
		}
		return clienteRepository.save(cliente);
	}

	@Override
	public List<Cliente> getAllActiveCliente() {
		return (List<Cliente>) clienteRepository.findAllByActiveTrue();
	}

	@Override
	public List<Cliente> getAllInactiveCliente() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteRepository.findAllByActiveFalse();
	}
	
	@Override
	public List<Cliente> getAllCliente(boolean isActive) {
		if (isActive) return getAllActiveCliente();
		else return getAllInactiveCliente();
	}

	@Override
	public Cliente updateCliente(Cliente Cliente, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCliente(Long id) {
		Cliente existingCliente = getClienteById(id);
		existingCliente.setActive(false);
		clienteRepository.save(existingCliente);
	}

}
