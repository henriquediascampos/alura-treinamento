package com.br.alura.alura.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "cat")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public String teste(){
        return "teste";
    }
}