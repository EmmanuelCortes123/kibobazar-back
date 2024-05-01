package com.kibobazar.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.kibobazar.app.entity.Cliente;

/*
 * La clase Optional se introdujo en Java 8 para representar
 * un valor que puede ser presente o ausente (null).
 * Evita el manejo de valores nulos directamente
 * */



public interface ClienteRepository extends CrudRepository<Cliente, Long>{
	Optional<Cliente> findByCorreo(String correo);// select * from cliente where email = ?1;
	Iterable<Cliente> findAllByActiveTrue();// select * from cliente where active = 1;
	Iterable<Cliente> findAllByActiveFalse();// select * from cliente where active = 0;
	//Iterable<Cliente> findAllByActive(bolean state); select * from cliente where active = ?1;
	boolean existsByCorreo(String correo);
}
