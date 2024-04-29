package com.kibobazar.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kibobazar.app.entity.Categoria;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido getPedidoByCorreo(String email) {
		// TODO Auto-generated method stub
		return null;
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
		return (List<Pedido>) pedidoRepository.findAllByActiveTrue();
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

}
