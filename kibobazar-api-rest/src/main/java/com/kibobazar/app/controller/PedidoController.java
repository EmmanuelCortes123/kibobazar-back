package com.kibobazar.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	/*
	 * Request Param
	 * Vincula los parámetros de una solicitud HTTP con los
	 * parametros del método.
	 * Permite extraer los valores de los parámetros de la consulta (query parameters).
	 * Si no proporciona los valores, se genera una excepción
	 * MissingServletRquestParametersException
	 * 
	 * En el ejemplo manejaremos la url como;
	 * localhost:8080/api/v1/cliente?active=true Todos los usuarios activos
	 * localhost:8080/api/v1/cliente?active=false Todos los usuarios inactivos
	 * */
	@GetMapping
	ResponseEntity<List< Pedido> > getAllPedido(
			@RequestParam( name="active", 
						   required=false, 	
						   defaultValue="true") boolean active
			){
		return  new ResponseEntity<List<Pedido>>(pedidoService.getAllPedido(active), HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	ResponseEntity<Pedido> getPedidoById(@PathVariable("id") Long id){
		return new ResponseEntity<Pedido>(pedidoService.getPedidoById(id) , HttpStatus.OK);
	}
	
	@PostMapping
	ResponseEntity<Pedido> createPedido(@RequestBody Pedido pedido){
		Pedido createPedido = pedidoService.createPedido(pedido);
		return new ResponseEntity<Pedido>(createPedido, HttpStatus.CREATED);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> detelePedido(@PathVariable("id") Long id){
		pedidoService.deletePedido(id);
		return new ResponseEntity<String>("User id " + id + " successfully deleted", HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	ResponseEntity<Pedido> updatepedido(
			@RequestBody Pedido pedido,
			@PathVariable("id") Long id
			){
		Pedido updatePedido = pedidoService.updatePedido(pedido, id);
		return new ResponseEntity<Pedido>(updatePedido, HttpStatus.OK);
	}
}