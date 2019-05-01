package com.br.alura.alura.models.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import com.br.alura.alura.models.familia.Familia;
import com.br.alura.alura.models.modeloGenerico.ModeloGenerico;

@Entity
@Table(name = "usuario")
public class Usuario extends ModeloGenerico {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "mysequence", sequenceName = "seq_usua_id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mysequence")
	@Column(name = "id_usuario")
	private Long id;

	@Column
	private String usuario;

	@Column
	private String senha;

	@Column
	private String nome;

	@Column
	private String sobreNome;

	@Column
	@Email
	private String email;

	@JoinColumn(name = "id_familia")
	private Familia familia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}
}
