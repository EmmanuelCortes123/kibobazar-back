package controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import entity.Privilegio;
import service.PrivilegioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/privilegio")
public class PrivilegioController {
    PrivilegioService privilegioService;
    public PrivilegioController(PrivilegioService privilegioService) {
        this.privilegioService = privilegioService;
    }

    @GetMapping
    List<Privilegio> getAllActivePrivilegio(){
        return privilegioService.getAllActivePrivilegio();
    }
}