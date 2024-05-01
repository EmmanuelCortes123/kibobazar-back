package com.kibobazar.app.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kibobazar.app.entity.Cliente;
import com.kibobazar.app.service.ClienteService;


@Service
public class UserDetailsServiceImp implements UserDetailsService{
	
	private ClienteService clienteService;
	
	public UserDetailsServiceImp(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@Override
	public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
		Cliente existingCliente = clienteService.getClienteByCorreo(correo);
		return new UserDetailsImp(existingCliente);
	}

}
