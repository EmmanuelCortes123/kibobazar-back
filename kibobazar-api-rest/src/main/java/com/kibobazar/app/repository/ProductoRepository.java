package com.kibobazar.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.kibobazar.app.entity.Cliente;
import com.kibobazar.app.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{
	Optional<Producto> findById(Long id);
	Optional<Producto> findByNombre(String nombre);
	Iterable<Producto> findAllByActiveTrue();
	Iterable<Producto> findAllByActiveFalse();
	boolean existsById(Long id);
}
