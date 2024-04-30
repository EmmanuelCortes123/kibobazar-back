package service;

import java.util.List;
import entity.Privilegio;

public interface PrivilegioService {
    Privilegio getPrivilegioById(Long id);
    Privilegio getPrivilegioByCorreo(String email);
    Privilegio createPrivilegio(Privilegio provilegio);
    List<Privilegio> getAllActivePrivilegio();
    List<Privilegio> getAllInactivePrivilegio();
    Privilegio updatePrivilegio(Privilegio privilegio, Long id);
    void deletePrivilegio(Long id);
}