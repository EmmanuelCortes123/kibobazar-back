package repository;

import entity.Privilegio;
import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface PrivilegioRepository extends CrudRepository <Privilegio, Long>{
    Optional<Privilegio> findById(Long id);
    Iterable<Privilegio> findAllByActiveTrue();
    Iterable<Privilegio> findAllByActiveFalse();
    boolean existsById(Long id);
}