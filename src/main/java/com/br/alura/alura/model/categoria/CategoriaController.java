package com.br.alura.alura.model.categoria;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(method = RequestMethod.GET, value = "findAll")
    public List<Categoria> findAll(){
        List<Categoria> catList = categoriaService.findAll();
        return catList;
    }
    
    @RequestMapping(method = RequestMethod.POST, value="save")
    public Categoria save(Categoria cate) {
        System.out.println(cate.getNome());
    	return categoriaService.save(cate);
    }
    
    @RequestMapping(method = RequestMethod.POST, value="patos")    
    public Categoria findById(Long pk){
        Categoria cate = categoriaService.findById(pk);
        return cate;
    }
}