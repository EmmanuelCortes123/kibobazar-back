package com.kibobazar.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.kibobazar.app.entity.Producto;
import com.kibobazar.app.repository.ProductoRepository;
import com.kibobazar.app.service.ProductoService;


@Service
public class ProductoServiceImpl implements ProductoService{
	
	ProductoRepository productoRepository;
	PasswordEncoder passwordEncoder;
	
	
	public ProductoServiceImpl(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	@Override
	public Producto getProductoById(Long id) {
		Optional<Producto> productoOptional = productoRepository.findById(id);
		Producto existingProducto;
		
		if( productoOptional.isPresent() ) {
			existingProducto = productoOptional.get();
			return existingProducto;
		} else {
			throw new IllegalStateException("Producto does not exist with id " + id);
		}
	}

	
	@Override
	public Producto getProductoByNombre(String nombre) {
		Optional<Producto> productoOptional = productoRepository.findByNombre(nombre);
		Producto existingProducto;
		if(productoOptional.isPresent()) {
			existingProducto = productoOptional.get();
			return existingProducto;
		}
		else {
			throw new IllegalStateException("Producto does not exist with nombre" + nombre);
		}
		
	}
	
	

	@Override
	public Producto createProducto(Producto producto) {
		producto.setId(null);
		// TODO Auto-generated method stub
		return productoRepository.save(producto);
	}

	@Override
	public List<Producto> getAllActiveProducto() {
		return (List<Producto>) productoRepository.findAllByActiveTrue();
	}

	@Override
	public List<Producto> getAllInactiveProducto() {
		return (List<Producto>) productoRepository.findAllByActiveFalse();
	}



	@Override
	public Producto updateProducto(Producto producto, Long id) {
		Producto existingProducto = getProductoById(id);
		existingProducto.setNombre(producto.getNombre());
		existingProducto.setTalla(producto.getTalla());
		existingProducto.setImagen(producto.getImagen());
		existingProducto.setMaterial(producto.getMaterial());
		existingProducto.setDescripcion(producto.getDescripcion());
		existingProducto.setMaterial(producto.getMaterial());
		existingProducto.setDescripcion(producto.getDescripcion());
		existingProducto.setMedidas(producto.getMedidas());
		existingProducto.setPrecio(producto.getPrecio());
		existingProducto.setCategoria(producto.getCategoria());
		return productoRepository.save(existingProducto);
		// TODO Auto-generated method
	}

	@Override
	public Producto deleteProducto(Long id) {
		Producto existingProducto = getProductoById(id);
		existingProducto.setActive(false);
		productoRepository.save(existingProducto);
		return null;
	}

	@Override
	public List<Producto> getAllProducto(boolean active) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
