package repository;

import entity.Producto;
import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface ProductoRepository extends CrudRepository<Producto, Long>{
    Optional<Producto> findById(Long id);
    Iterable<Producto> findAllByActiveTrue();
    Iterable<Producto> findAllByActiveFalse();
    boolean existsById(Long id);
}