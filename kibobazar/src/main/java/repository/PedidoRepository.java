package repository;

import entity.Pedido;
import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface PedidoRepository extends CrudRepository <Pedido, Long>{
    Optional<Pedido> findById(Long id);
    Iterable<Pedido> findAllByActiveTrue();
    Iterable<Pedido> findAllByActiveFalse();
    boolean existsById(Long id);
}