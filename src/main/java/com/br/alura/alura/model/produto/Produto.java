package com.br.alura.alura.model.produto;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Produto implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @SequenceGenerator(name="mysequence", allocationSize=1, sequenceName="seq_prot_id", initialValue=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE ,generator="mysequence")
    @Id
    private Long id;
    
    @Column
    private String nome;

    @Column(precision=10, scale=2)
    private BigDecimal preco;

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

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
}