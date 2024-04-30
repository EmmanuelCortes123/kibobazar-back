package service;

import java.util.List;
import entity.Cliente;

public interface ClienteService {
    Cliente getClienteById(Long id);
    Cliente getClienteByCorreo(String email);
    Cliente createCliente(Cliente cliente);
    List<Cliente> getAllActiveCliente();
    List<Cliente> getAllInactiveCliente();
    Cliente updateCliente(Cliente cliente, Long id);
    void deleteCliente(Long id);
}