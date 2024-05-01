package com.kibobazar.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.kibobazar.app.entity.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Long>{
	Optional<Categoria> findById(Long id);
	boolean existsById(Long id);
}