
package com.kibobazar.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.kibobazar.app.entity.Pedido;

/*
 * La clase Optional se introdujo en Java 8 para representar
 * un valor que puede ser presente o ausente (null).
 * Evita el manejo de valores nulos directamente
 * */

public interface PedidoRepository extends CrudRepository <Pedido, Long>{
	Optional<Pedido> findById(Long id);
	Iterable<Pedido> findAllByActiveTrue();
	Iterable<Pedido> findAllByActiveFalse();
	boolean existsById(Long id);
	Optional<Pedido> findByCorreo(String email);
	boolean existsByCorreo(String correo);
	
}
