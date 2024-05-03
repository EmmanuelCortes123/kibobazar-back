package com.kibobazar.app.service.impl;

import java.util.List;
import java.util.Optional;

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
		Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
		Categoria existingCategoria;
		
		if( categoriaOptional.isPresent() ) {
			existingCategoria = categoriaOptional.get();
			return existingCategoria;
		} else {
			throw new IllegalStateException("User does not exist with id " + id);
		}
	}

	@Override
	public Categoria getCategoriaByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public Categoria createCategoria(Categoria categoria) {
        categoria.setActive(true);
        categoria.setId(null);

        categoria.setDescripcion(categoria.getDescripcion());

        if(categoriaRepository.existsByNombre(categoria.getNombre())) {
            throw new IllegalStateException("Categoria exist with nombre " + categoria.getNombre());
        }
        return categoriaRepository.save(categoria);
    }

	@Override
	public List<Categoria> getAllActiveCategoria() {
		return (List<Categoria>) categoriaRepository.findAllByActiveTrue();
	}

	@Override
	public List<Categoria> getAllInactiveCategoria() {
		return (List<Categoria>) categoriaRepository.findAllByActiveFalse();
	}

	@Override
	public Categoria updateCategoria(Categoria categoria, Long id) {
		Categoria existingCategoria = getCategoriaById(id);
		existingCategoria.setNombre(categoria.getNombre());
		existingCategoria.setDescripcion(categoria.getDescripcion());
		return categoriaRepository.save(existingCategoria);
	}

	@Override
	public void deleteCategoria(Long id) {
		Categoria existingCategoria = getCategoriaById(id);
		existingCategoria.setActive(false);
		categoriaRepository.save(existingCategoria);
	}

	@Override
	public List<Categoria> getAllCategoria(boolean isActive) {
		// TODO Auto-generated method stub
		return null;
	}

}
