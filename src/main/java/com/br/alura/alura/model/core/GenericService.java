package com.br.alura.alura.model.core;

import java.util.List;

import org.springframework.stereotype.Service;

@Service 
public interface GenericService <T, PK>{
    
    public List<T> findAll ();    
    public T save(T t);
    public T findById(PK pk);
}