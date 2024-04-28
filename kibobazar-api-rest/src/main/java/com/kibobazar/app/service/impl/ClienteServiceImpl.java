package com.kibobazar.app.service.impl;

import java.util.List;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente getClienteByCorreo(String emial) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente createCliente(Cliente Cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> getAllActiveCliente() {
		return (List<Cliente>) clienteRepository.findAllByActiveTrue();
	}

	@Override
	public List<Cliente> getAllInactiveCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente updateCliente(Cliente Cliente, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCliente(Long id) {
		// TODO Auto-generated method stub
		
	}

}
