package com.kibobazar.app.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.kibobazar.app.entity.Cliente;

public class UserDetailsImp implements UserDetails{
	
	private Cliente cliente;
	
	public UserDetailsImp(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		
		
		authorities.add(
				new SimpleGrantedAuthority("ROLE_" + this.cliente.getPrivilegio().getPrivilegios().toUpperCase())
				);
		return authorities;
	}

	@Override
	public String getPassword() {
		return cliente.getContraseña();
	}

	@Override
	public String getUsername() {
		return cliente.getCorreo();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return cliente.getActive();
	}

}
