package com.kibobazar.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.kibobazar.app.entity.Cliente;
import com.kibobazar.app.service.ClienteService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/clientes")
public class ClienteController {
	ClienteService clienteService;
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@GetMapping
	List<Cliente> getAllActiveCliente(){
		return clienteService.getAllActiveCliente();
	}
}
