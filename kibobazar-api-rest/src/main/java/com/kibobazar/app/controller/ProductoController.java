package com.kibobazar.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kibobazar.app.entity.Producto;
import com.kibobazar.app.service.ProductoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/productos")
public class ProductoController {
	ProductoService productoService;
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}
	
	@GetMapping
	ResponseEntity<List< Producto> > getAllProducto(
			@RequestParam( name="active", 
						   required=false, 	
						   defaultValue="true") boolean active
			){
		return  new ResponseEntity<List<Producto>>(productoService.getAllProducto(active), HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	ResponseEntity<Producto> getProductoById(@PathVariable("id") Long id){
		return new ResponseEntity<Producto>(productoService.getProductoById(id) , HttpStatus.OK);
	}
	
	@PostMapping
	ResponseEntity<Producto> createProducto(@RequestBody Producto producto){
		Producto createProducto = productoService.createProducto(producto);
		return new ResponseEntity<Producto>(createProducto, HttpStatus.CREATED);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteProducto(@PathVariable("id") Long id){
		productoService.deleteProducto(id);
		return new ResponseEntity<String>("Producto id " + id + " successfully deleted", HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	ResponseEntity<Producto> updateProducto(
			@RequestBody Producto producto,
			@PathVariable("id") Long id
			){
		Producto updateProducto = productoService.updateProducto(producto, id);
		return new ResponseEntity<Producto>(updateProducto, HttpStatus.OK);
	}
	
	
	
}
