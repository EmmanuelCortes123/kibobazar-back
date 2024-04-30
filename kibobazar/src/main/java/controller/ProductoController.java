package controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import entity.Producto;
import service.ProductoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/producto")
public class ProductoController {
    ProductoService productoService;
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    List<Producto> getAllActiveProducto(){
        return productoService.getAllActiveProducto();
    }
}
