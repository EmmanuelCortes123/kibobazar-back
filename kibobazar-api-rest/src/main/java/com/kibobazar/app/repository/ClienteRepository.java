package com.kibobazar.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.kibobazar.app.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long>{
	Optional<Cliente> findByCorreo(String correo);
	Iterable<Cliente> findAllByActiveTrue();
	Iterable<Cliente> findAllByActiveFalse();
	boolean existsByCorreo(String correo);
}
