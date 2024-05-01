package com.kibobazar.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kibobazar.app.entity.Categoria;
import com.kibobazar.app.repository.CategoriaRepository;
import com.kibobazar.app.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{
	
	CategoriaRepository categoriaRepository;
	public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}
	@Override
	public Categoria getCategoriaById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Categoria getCategoriaByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Categoria createCategoria(Categoria categoria) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Categoria> getAllActiveCategoria() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Categoria> getAllInactiveCategoria() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Categoria updateCategoria(Categoria categoria, Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteCategoria(Long id) {
		// TODO Auto-generated method stub
		
	}

	

}
