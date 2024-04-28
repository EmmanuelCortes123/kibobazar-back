package com.kibobazar.app.service;

import java.util.List;

import com.kibobazar.app.entity.Cliente;

public interface ClienteService {
	Cliente getClienteById(Long id);
	Cliente getClienteByCorreo(String email);
	Cliente createCliente(Cliente cliente);
	List<Cliente> getAllActiveCliente();
	List<Cliente> getAllInactiveCliente();
	Cliente updateCliente(Cliente cliente, Long id);
	void deleteCliente(Long id);
}
