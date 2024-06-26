package com.kibobazar.app.service;

import java.util.List;

import com.kibobazar.app.entity.Categoria;

public interface CategoriaService {
	Categoria getCategoriaById(Long id);
	Categoria getCategoriaByNombre(String nombre);
	Categoria createCategoria(Categoria categoria);
	List<Categoria> getAllActiveCategoria();
	List<Categoria> getAllInactiveCategoria();
	List<Categoria> getAllCategoria(boolean isActive);
	Categoria updateCategoria(Categoria categoria, Long id);
	void deleteCategoria(Long id);
}
