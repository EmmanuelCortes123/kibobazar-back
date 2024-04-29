package com.kibobazar.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.kibobazar.app.entity.Pedido;
import com.kibobazar.app.service.PedidoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/pedido")
public class PedidoController {
	PedidoService pedidoService;
	public PedidoController(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}
	
	@GetMapping
	List<Pedido> getAllActivePedido(){
		return pedidoService.getAllActivePedido();
	}
}
