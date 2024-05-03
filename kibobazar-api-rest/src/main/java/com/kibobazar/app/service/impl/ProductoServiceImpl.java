package com.kibobazar.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kibobazar.app.entity.Categoria;
import com.kibobazar.app.entity.Cliente;
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
		
		if( productoOptional.isPresent() ) {
			existingProducto = productoOptional.get();
			return existingProducto;
		} else {
			throw new IllegalStateException("Producto does not exist with nombre " + nombre);
		}
	}

	@Override
    public Producto createProducto(Producto producto) {
        producto.setActive(true);
        producto.setId(null);

        producto.setNombre(producto.getNombre());
        producto.setTalla(producto.getTalla());
        producto.setImagen(producto.getImagen());
        producto.setMaterial(producto.getMaterial());
        producto.setDescripcion(producto.getDescripcion());
        producto.setMedidas(producto.getMedidas());
        producto.setPrecio(producto.getPrecio());


        if(productoRepository.existsByNombre(producto.getNombre())) {
            throw new IllegalStateException("Producto exist with nombre " + producto.getNombre());
        }
        return productoRepository.save(producto);
    }

	@Override
	public List<Producto> getAllActiveProducto() {
		return (List<Producto>) productoRepository.findAllByActiveTrue();
	}

	@Override
	public List<Producto> getAllInactiveProducto() {
		// TODO Auto-generated method stub
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
		existingProducto.setMedidas(producto.getMedidas());
		existingProducto.setPrecio(producto.getPrecio());
		return productoRepository.save(existingProducto);
	}

	@Override
	public List<Producto> getAllProducto(boolean isActive) {
		if (isActive) return getAllActiveProducto();
		else return getAllInactiveProducto();
	}

	@Override
	public void deleteProducto(Long id) {
		Producto existingProducto = getProductoById(id);
		existingProducto.setActive(false);
		productoRepository.save(existingProducto);
	}
}
