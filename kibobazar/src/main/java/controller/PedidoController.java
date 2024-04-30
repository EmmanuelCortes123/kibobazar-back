package controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import entity.Pedido;
import service.PedidoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/pedido")
public class PedidoController {
    PedidoService pedidoService;
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping
    List<Pedido> getAllActivePedido(){
        return pedidoService.getAllActivePedido();
    }
}