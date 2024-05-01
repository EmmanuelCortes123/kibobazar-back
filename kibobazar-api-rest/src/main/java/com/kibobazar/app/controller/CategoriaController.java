package com.kibobazar.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kibobazar.app.entity.Categoria;
import com.kibobazar.app.entity.Cliente;
import com.kibobazar.app.service.CategoriaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/categoria")
public class CategoriaController {
	CategoriaService categoriaService;
	public CategoriaController(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
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
	ResponseEntity<List< Categoria> > getAllCategoria(
			@RequestParam( name="active", 
						   required=false, 	
						   defaultValue="true") boolean active
			){
		return new ResponseEntity<List<Categoria>>(categoriaService.getAllCategoria(active), HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	ResponseEntity<Categoria> getCategoriaById(@PathVariable("id") Long id){
		return new ResponseEntity<Categoria>(categoriaService.getCategoriaById(id) , HttpStatus.OK);
	}
	
	@PostMapping
	ResponseEntity<Categoria> createCategoria(@RequestBody Categoria Categoria){
		Categoria createCategoria = categoriaService.createCategoria(Categoria);
		return new ResponseEntity<Categoria>(createCategoria, HttpStatus.CREATED);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deteleCategoria(@PathVariable("id") Long id){
		categoriaService.deleteCategoria(id);
		return new ResponseEntity<String>("User id " + id + " successfully deleted", HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	ResponseEntity<Categoria> updateCategoria(
			@RequestBody Categoria Categoria,
			@PathVariable("id") Long id
			){
		Categoria updateCategoria = categoriaService.updateCategoria(Categoria, id);
		return new ResponseEntity<Categoria>(updateCategoria, HttpStatus.OK);
	}
}
