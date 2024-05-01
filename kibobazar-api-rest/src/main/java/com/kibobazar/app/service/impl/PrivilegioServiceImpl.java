package com.kibobazar.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kibobazar.app.entity.Categoria;
import com.kibobazar.app.entity.Privilegio;
import com.kibobazar.app.repository.PrivilegioRepository;
import com.kibobazar.app.service.PrivilegioService;


@Service
public class PrivilegioServiceImpl implements PrivilegioService{
	
	PrivilegioRepository privilegioRepository;
	public PrivilegioServiceImpl(PrivilegioRepository privilegioRepository) {
		this.privilegioRepository = privilegioRepository;
	}
	@Override
	public Privilegio getPrivilegioById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Privilegio getPrivilegioByCorreo(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Privilegio createPrivilegio(Privilegio provilegio) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Privilegio> getAllActivePrivilegio() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Privilegio> getAllInactivePrivilegio() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Privilegio updatePrivilegio(Privilegio privilegio, Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deletePrivilegio(Long id) {
		// TODO Auto-generated method stub
		
	}
}

	