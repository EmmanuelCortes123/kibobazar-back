package com.kibobazar.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

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
		Optional<Privilegio> privilegioOptional = privilegioRepository.findById(id);
		Privilegio existingPrivilegio;
		
		if( privilegioOptional.isPresent() ) {
			existingPrivilegio = privilegioOptional.get();
			return existingPrivilegio;
		} else {
			throw new IllegalStateException("Privilegio does not exist with id " + id);
		}
	}

	@Override
	public Privilegio createPrivilegio(Privilegio provilegio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Privilegio> getAllActivePrivilegio() {
		return (List<Privilegio>) privilegioRepository.findAllByActiveTrue();
	}

	@Override
	public List<Privilegio> getAllInactivePrivilegio() {
		
		return (List<Privilegio>) privilegioRepository.findAllByActiveFalse();
	}

	@Override
	public Privilegio updatePrivilegio(Privilegio privilegio, Long id) {
		Privilegio existingPrivilegio = getPrivilegioById(id);
		existingPrivilegio.setId(privilegio.getId());
		existingPrivilegio.setPrivilegios(privilegio.getPrivilegios());
		return privilegioRepository.save(existingPrivilegio);
	}

	@Override
	public void deletePrivilegio(Long id) {
		Privilegio existingPrivilegio = getPrivilegioById(id);
		existingPrivilegio.setActive(false);
		privilegioRepository.save(existingPrivilegio);
	}

	@Override
	public List<Privilegio> getAllPrivilegio(boolean isActive) {
		if (isActive) return getAllActivePrivilegio();
		else return getAllInactivePrivilegio();
	}

}
