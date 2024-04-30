package repository;

import entity.Categoria;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria, Long>{
    Optional<Categoria> findById(Long id);
    Iterable<Categoria> findAllByActiveTrue();
    Iterable<Categoria> findAllByActiveFalse();
    boolean existsById(Long id);
}
