package com.kibobazar.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.kibobazar.app.entity.Pedido;
import com.kibobazar.app.repository.PedidoRepository;
import com.kibobazar.app.service.PedidoService;


@Service
public class PedidoServiceImpl implements PedidoService{
	
	PedidoRepository pedidoRepository;
	PasswordEncoder passwordEncoder;
	
	public PedidoServiceImpl(PedidoRepository pedidoRepository, PasswordEncoder passwordEncoder) {
		this.pedidoRepository = pedidoRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public Pedido getPedidoById(Long id) {
		Optional<Pedido> pedidoOptional = pedidoRepository.findById(id);
		Pedido existingPedido;
		
		if( pedidoOptional.isPresent() ) {
			existingPedido = pedidoOptional.get();
			return existingPedido;
		} else {
			throw new IllegalStateException("Pedido does not exist with id " + id);
		}
	}

	@Override
	public Pedido getPedidoByCorreo(String email) {
		
		Optional<Pedido> pedidoOptional = pedidoRepository.findByCorreo(email);
		Pedido existingPedido;
		
		if( pedidoOptional.isPresent() ) {
			existingPedido = pedidoOptional.get();
			return existingPedido;
		} else {
			throw new IllegalStateException("Pedido does not exist with correo " + email);
		}
	}

	
	@Override
	public Pedido createPedido(Pedido pedido) {
		pedido.setActive(true);
		pedido.setId(null);
		
		pedido.setContraseña(passwordEncoder.encode(pedido.getContraseña()));
		
		if(pedidoRepository.existsByCorreo(pedido.getCorreo())) {
			throw new IllegalStateException("Pedido exist with email " + pedido.getCorreo());
		}
		return pedidoRepository.save(pedido);
	}
	
	
	@Override
	public List<Pedido> getAllActivePedido() {
		return (List<Pedido>) pedidoRepository.findAllByActiveTrue();
	}

	@Override
	public List<Pedido> getAllInactivePedido() {
		return (List<Pedido>) pedidoRepository.findAllByActiveFalse();
	}
	
	@Override
	public List<Pedido> getAllPedido(boolean isActive) {
		if (isActive) return getAllActivePedido();
		else return getAllInactivePedido();
	}
	
	@Override
	public Pedido updatePedido(Pedido pedido, Long id) {
		Pedido existingPedido = getPedidoById(id);
		existingPedido.setNombre(pedido.getNombre());
		existingPedido.setApellido(pedido.getApellido());
		existingPedido.setContraseña(pedido.getContraseña());
		existingPedido.setTelefono(pedido.getTelefono());
		return pedidoRepository.save(existingPedido);
	}
	
	
	@Override
	public Pedido createPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pedido> getAllActivePedido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pedido> getAllInactivePedido() {
		return null;
	}

	@Override
	public Pedido updatePedido(Pedido pedido, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePedido(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pedido> getAllPedido(boolean isActive) {
		// TODO Auto-generated method stub
		return null;
	}

}