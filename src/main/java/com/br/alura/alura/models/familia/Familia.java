package com.br.alura.alura.models.familia;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.br.alura.alura.models.modeloGenerico.ModeloGenerico;
import com.br.alura.alura.models.usuario.Usuario;

@Entity
@Table
public class Familia extends ModeloGenerico {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "mysequence", sequenceName = "seq_fami_id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mysequence")
	@Column(name = "fami_id")
	private Long id;

	@Column
	private String nome;

	// private List<Usuario> usuarios;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// public List<Usuario> getUsuarios() {
	// 	return usuarios;
	// }

	// public void setUsuarios(List<Usuario> usuarios) {
	// 	this.usuarios = usuarios;
	// }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
