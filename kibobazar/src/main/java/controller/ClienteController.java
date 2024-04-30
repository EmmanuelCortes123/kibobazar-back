package controller;

import entity.Cliente;
import service.ClienteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/clientes")
public class ClienteController {
    ClienteService clienteService;
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    List<Cliente> getAllActiveCliente(){
        return clienteService.getAllActiveCliente();
    }
}