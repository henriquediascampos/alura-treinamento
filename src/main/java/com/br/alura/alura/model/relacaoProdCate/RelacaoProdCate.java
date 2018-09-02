package com.br.alura.alura.model.relacaoProdCate;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.br.alura.alura.model.categoria.Categoria;
import com.br.alura.alura.model.produto.Produto;

@Entity
public class RelacaoProdCate implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @SequenceGenerator(name="mysequence", sequenceName="seq_prca_id", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="mysequence")
    @Id
    private Long id;

    @JoinColumn
    @ManyToOne
    private Categoria categoria;

    @ManyToOne
    @JoinColumn
    private Produto produto;

    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}