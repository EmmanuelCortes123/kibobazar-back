package service;

import java.util.List;
import entity.Producto;

public interface ProductoService {
    Producto getProductoById(Long id);
    Producto getProductoByNombre(String nombre);
    Producto createProducto(Producto producto);
    List<Producto> getAllActiveProducto();
    List<Producto> getAllInactiveProducto();
    Producto updateProducto(Producto producto, Long id);
}