package com.kibobazar.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.kibobazar.app.entity.Producto;
import com.kibobazar.app.service.ProductoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/producto")
public class ProductoController {
	ProductoService productoService;
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}
	
	@GetMapping
	List<Producto> getAllActiveProducto(){
		return productoService.getAllActiveProducto();
	}
}
