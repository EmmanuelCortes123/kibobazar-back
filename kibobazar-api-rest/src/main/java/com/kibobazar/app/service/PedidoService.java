package com.kibobazar.app.service;

import java.util.List;

import com.kibobazar.app.entity.Pedido;

public interface PedidoService {
	Pedido getPedidoById(Long id);
	Pedido getPedidoByCorreo(String email);
	Pedido createPedido(Pedido pedido);
	List<Pedido> getAllActivePedido();
	List<Pedido> getAllInactivePedido();
	List<Pedido> getAllPedido(boolean isActive);
	Pedido updatePedido(Pedido pedido, Long id);
	void deletePedido(Long id);
}
