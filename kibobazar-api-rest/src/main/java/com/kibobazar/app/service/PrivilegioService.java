package com.kibobazar.app.service;

import java.util.List;

import com.kibobazar.app.entity.Privilegio;

public interface PrivilegioService {
	Privilegio getPrivilegioById(Long id);
	Privilegio createPrivilegio(Privilegio provilegio);
	List<Privilegio> getAllActivePrivilegio();
	List<Privilegio> getAllInactivePrivilegio();
	List<Privilegio> getAllPrivilegio(boolean isActive);
	Privilegio updatePrivilegio(Privilegio privilegio, Long id);
	void deletePrivilegio(Long id);
}
