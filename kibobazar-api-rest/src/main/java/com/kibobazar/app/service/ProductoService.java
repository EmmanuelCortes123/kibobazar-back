package com.kibobazar.app.service;

import java.util.List;

import com.kibobazar.app.entity.Producto;

public interface ProductoService {
	Producto getProductoById(Long id);
	Producto getProductoByNombre(String nombre);
	Producto createProducto(Producto producto);
	Producto deleteProducto(Long id);
	List<Producto> getAllProducto(boolean active);
	List<Producto> getAllActiveProducto();
	List<Producto> getAllInactiveProducto();
	Producto updateProducto(Producto producto, Long id);
	
}
