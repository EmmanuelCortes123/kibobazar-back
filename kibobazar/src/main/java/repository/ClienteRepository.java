package repository;

    import entity.Cliente;
    import java.util.*;
    import org.springframework.data.repository.CrudRepository;

    public interface ClienteRepository extends CrudRepository<Cliente, Long> {
        Optional<Cliente> findByCorreo(String correo);

        Iterable<Cliente> findAllByActiveTrue();

        Iterable<Cliente> findAllByActiveFalse();

        boolean existsByCorreo(String correo);
    }
