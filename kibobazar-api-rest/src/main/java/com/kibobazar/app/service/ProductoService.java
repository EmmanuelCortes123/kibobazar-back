package com.kibobazar.app.service;

import java.util.List;

import com.kibobazar.app.entity.Producto;

public interface ProductoService {
	Producto getProductoById(Long id);
	Producto getProductoByNombre(String nombre);
	Producto createProducto(Producto producto);
	List<Producto> getAllActiveProducto();
	List<Producto> getAllInactiveProducto();
	List<Producto> getAllProducto(boolean isActive);
	Producto updateProducto(Producto producto, Long id);
	void deleteProducto(Long id);
}
