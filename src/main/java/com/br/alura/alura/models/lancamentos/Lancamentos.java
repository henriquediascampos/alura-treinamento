package com.br.alura.alura.models.lancamentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.br.alura.alura.models.conta.Contas;
import com.br.alura.alura.models.familia.Familia;
import com.br.alura.alura.models.modeloGenerico.ModeloGenerico;
import com.br.alura.alura.models.usuario.Usuario;

@Entity
@Table
public class Lancamentos extends ModeloGenerico {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "mysequence", sequenceName = "seq_lanc_id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mysequence")
	@Column(name = "lanc_id")
	private Long id;

	@Column
	private String nome;

	private ETipoLacamento tipo;

	@JoinColumn
	private Usuario usuario;

	@JoinColumn
	private Familia familia;
	
	@JoinColumn
	private Contas contas;

	// private Entrada Entrada;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the tipo
	 */
	public ETipoLacamento getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(ETipoLacamento tipo) {
		this.tipo = tipo;
	}


}
