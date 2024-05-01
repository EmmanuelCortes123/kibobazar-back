package com.kibobazar.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	ResponseEntity<List< Cliente> > getAllCliente(
			@RequestParam( name="active", 
						   required=false, 	
						   defaultValue="true") boolean active
			){
		return  new ResponseEntity<List<Cliente>>(clienteService.getAllCliente(active), HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	ResponseEntity<Cliente> getClienteById(@PathVariable("id") Long id){
		return new ResponseEntity<Cliente>(clienteService.getClienteById(id) , HttpStatus.OK);
	}
	
	@PostMapping
	ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente){
		Cliente createCliente = clienteService.createCliente(cliente);
		return new ResponseEntity<Cliente>(createCliente, HttpStatus.CREATED);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deteleCliente(@PathVariable("id") Long id){
		clienteService.deleteCliente(id);
		return new ResponseEntity<String>("User id " + id + " successfully deleted", HttpStatus.OK);
	}
}
