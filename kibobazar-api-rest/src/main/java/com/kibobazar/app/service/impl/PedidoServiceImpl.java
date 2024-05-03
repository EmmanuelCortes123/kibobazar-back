package com.kibobazar.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kibobazar.app.entity.Pedido;
import com.kibobazar.app.repository.PedidoRepository;
import com.kibobazar.app.service.PedidoService;


@Service
public class PedidoServiceImpl implements PedidoService{
	
	PedidoRepository pedidoRepository;
	public PedidoServiceImpl(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
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
		// TODO Auto-generated method stub
		return null;
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
	public Pedido updatePedido(Pedido pedido, Long id) {
		Pedido existingPedido = getPedidoById(id);
		existingPedido.setMonto(pedido.getMonto());
		existingPedido.setDireccionEnvio(pedido.getDireccionEnvio());
		existingPedido.setDireccionPedido(pedido.getDireccionPedido());
		existingPedido.setCorreo(pedido.getCorreo());
		existingPedido.setFechaPedido(pedido.getFechaPedido());
		existingPedido.setEstadoPedido(pedido.getEstadoPedido());
		return pedidoRepository.save(existingPedido);
	}

	@Override
	public void deletePedido(Long id) {
		Pedido existingPedido = getPedidoById(id);
		existingPedido.setActive(false);
		pedidoRepository.save(existingPedido);
		
	}

	@Override
	public List<Pedido> getAllPedido(boolean isActive) {
		if (isActive) return getAllActivePedido();
		else return getAllInactivePedido();
	}

}
