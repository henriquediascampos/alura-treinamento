package com.br.alura.alura.model.pedido;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.br.alura.alura.model.endereco.Endereco;

@Entity
public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;

	@SequenceGenerator(name="mysequence", sequenceName="seq_pedi_id", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="mysequence")
	@Id
	private Long id;
	
	@Column
	private LocalDateTime instante;

	@JoinColumn
	@ManyToOne
	private Endereco endereco;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getInstante() {
		return instante;
	}

	public void setInstante(LocalDateTime instante) {
		this.instante = instante;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
