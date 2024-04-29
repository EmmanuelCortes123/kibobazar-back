package com.kibobazar.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.kibobazar.app.entity.Categoria;
import com.kibobazar.app.service.CategoriaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/categoria")
public class CategoriaController {
	CategoriaService categoriaService;
	public CategoriaController(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}
	
	@GetMapping
	List<Categoria> getAllActiveCategoria(){
		return categoriaService.getAllActiveCategoria();
	}
}
