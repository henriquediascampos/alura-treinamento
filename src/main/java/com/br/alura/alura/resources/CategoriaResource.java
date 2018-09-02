package com.br.alura.alura.resources;

import java.util.ArrayList;
import java.util.List;

import com.br.alura.alura.model.categoria.Categoria;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "categorias")
public class CategoriaResource {

    // @Autowired
    // private CategoriaService categoriaService;

    // @RequestMapping(method = RequestMethod.GET, value = "listar")
    // public List<Categoria> listar(){
    //     List<Categoria> catList = categoriaService.listar();
    //     return catList;
    // }
    
    @RequestMapping(method = RequestMethod.GET, value = "listar2")
    public List<Categoria> teste(){
        Categoria cat1 = new Categoria();
        cat1.setId(1l); cat1.setNome("informatica");

        Categoria cat2 = new Categoria();
        cat2.setId(2l);
         cat2.setNome("Escritório");

        List<Categoria> catList = new ArrayList<>();
        catList.add(cat1); catList.add(cat2);
        return catList;
    }
}