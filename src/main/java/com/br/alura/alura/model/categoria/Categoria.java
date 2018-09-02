package com.br.alura.alura.model.categoria;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Categoria implements Serializable{
	private static final long serialVersionUID = 1L;
    @SequenceGenerator(name= "mysequesce" ,initialValue = 1, sequenceName = "seq_cate_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="mysequesce")
    @Id
	private Long id;
    @Column
    private String nome;
        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}