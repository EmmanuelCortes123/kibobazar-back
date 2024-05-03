package com.kibobazar.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kibobazar.app.entity.Categoria;
import com.kibobazar.app.service.CategoriaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/categorias")
public class CategoriaController {
	
	CategoriaService categoriaService;
	
	public CategoriaController(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}
	
	
	  @GetMapping
	ResponseEntity<List< Categoria> > getAllCategoria(
			@RequestParam( name="active", 
						   required=false, 	
						   defaultValue="true") boolean active
			){
		return  new ResponseEntity<List<Categoria>>(categoriaService.getAllCategoria(active), HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	ResponseEntity<Categoria> getCategoriaById(@PathVariable("id") Long id){
		return new ResponseEntity<Categoria>(categoriaService.getCategoriaById(id) , HttpStatus.OK);
	}
	
	@PostMapping
	ResponseEntity<Categoria> createCategoria(@RequestBody Categoria categoria){
		Categoria createCategoria = categoriaService.createCategoria(categoria);
		return new ResponseEntity<Categoria>(createCategoria, HttpStatus.CREATED);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deteleCategoria(@PathVariable("id") Long id){
		categoriaService.deleteCategoria(id);
		return new ResponseEntity<String>("Categoria id " + id + " successfully deleted", HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	ResponseEntity<Categoria> updateCategoria(
			@RequestBody Categoria categoria,
			@PathVariable("id") Long id
			){
		Categoria updateCategoria = categoriaService.updateCategoria(categoria, id);
		return new ResponseEntity<Categoria>(updateCategoria, HttpStatus.OK);
	}
	  
}
