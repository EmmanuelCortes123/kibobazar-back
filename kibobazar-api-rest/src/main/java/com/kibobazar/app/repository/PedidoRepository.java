package com.kibobazar.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.kibobazar.app.entity.Pedido;

public interface PedidoRepository extends CrudRepository <Pedido, Long>{
	Optional<Pedido> findById(Long id);
	boolean existsById(Long id);
}
