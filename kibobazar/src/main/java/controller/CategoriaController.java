package controller;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import entity.Categoria;
import service.CategoriaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/categoria")
public class CategoriaController {
    CategoriaService categoriaService;
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    List<Categoria> getAllActiveCategoria(){
        return categoriaService.getAllActiveCategoria();
    }
}
