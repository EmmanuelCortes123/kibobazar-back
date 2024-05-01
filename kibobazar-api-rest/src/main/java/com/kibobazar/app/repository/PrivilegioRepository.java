package com.kibobazar.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.kibobazar.app.entity.Privilegio;

public interface PrivilegioRepository extends CrudRepository <Privilegio, Long>{
	Optional<Privilegio> findById(Long id);
	boolean existsById(Long id);
}
