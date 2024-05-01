package com.kibobazar.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.kibobazar.app.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{
	Optional<Producto> findById(Long id);
	boolean existsById(Long id);
}
