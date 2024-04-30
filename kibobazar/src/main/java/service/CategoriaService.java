package service;

import java.util.List;
import entity.Categoria;

public interface CategoriaService {
    Categoria getCategoriaById(Long id);
    Categoria getCategoriaByNombre(String nombre);
    Categoria createCategoria(Categoria categoria);
    List<Categoria> getAllActiveCategoria();
    List<Categoria> getAllInactiveCategoria();
    Categoria updateCategoria(Categoria categoria, Long id);
    void deleteCategoria(Long id);
}