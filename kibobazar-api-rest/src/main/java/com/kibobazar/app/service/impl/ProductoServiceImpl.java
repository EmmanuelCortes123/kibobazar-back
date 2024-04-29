package com.kibobazar.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kibobazar.app.entity.Categoria;
import com.kibobazar.app.entity.Producto;
import com.kibobazar.app.repository.ProductoRepository;
import com.kibobazar.app.service.ProductoService;


@Service
public class ProductoServiceImpl implements ProductoService{
	
	ProductoRepository productoRepository;
	public ProductoServiceImpl(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	@Override
	public Producto getProductoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto getProductoByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto createProducto(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> getAllActiveProducto() {
		return (List<Producto>) productoRepository.findAllByActiveTrue();
	}

	@Override
	public List<Producto> getAllInactiveProducto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto updateProducto(Producto producto, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
