package com.br.alura.alura.models.conta;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.br.alura.alura.models.familia.Familia;
import com.br.alura.alura.models.modeloGenerico.ModeloGenerico;
import com.br.alura.alura.models.usuario.Usuario;

@Entity
@Table(name = "contas")
public class Contas extends ModeloGenerico{
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "mysequence", sequenceName = "seq_cont_id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mysequence")
	@Column(name="id_conta")
	private Long id;

	@Column
	private String descricao;

	@JoinColumn(name="id_usuario")
	private Usuario usuario;

	@JoinColumn(name="id_familia")
	private Familia familia;

	@Column(precision=10, scale=2)
	private BigDecimal valor;

	@Column(name="qtd_parcelas")
	private Contas qtdParcelas;
	
	@Column(name="qtd_parcelas_pagas")
	private Integer qtdParcelasPagas;
	
	@Column(name="qtd_parcelas_faltantes")
	private Integer qtdParcelasFaltantes;

	@Column(name="status_pagamento")
	private Character statusPagamento;

	@Column(name="dt_vencimento")
	private LocalDate dtVencimeto;

	public Long getId() {
		return id;
	}

	/**
	 * @return the dtVencimeto
	 */
	public LocalDate getDtVencimeto() {
		return dtVencimeto;
	}

	/**
	 * @param dtVencimeto the dtVencimeto to set
	 */
	public void setDtVencimeto(LocalDate dtVencimeto) {
		this.dtVencimeto = dtVencimeto;
	}

	/**
	 * @return the statusPagamento
	 */
	public Character getStatusPagamento() {
		return statusPagamento;
	}

	/**
	 * @param statusPagamento the statusPagamento to set
	 */
	public void setStatusPagamento(Character statusPagamento) {
		this.statusPagamento = statusPagamento;
	}

	/**
	 * @return the qtdParcelasFaltantes
	 */
	public Integer getQtdParcelasFaltantes() {
		return qtdParcelasFaltantes;
	}

	/**
	 * @param qtdParcelasFaltantes the qtdParcelasFaltantes to set
	 */
	public void setQtdParcelasFaltantes(Integer qtdParcelasFaltantes) {
		this.qtdParcelasFaltantes = qtdParcelasFaltantes;
	}

	/**
	 * @return the qtdParcelasPagas
	 */
	public Integer getQtdParcelasPagas() {
		return qtdParcelasPagas;
	}

	/**
	 * @param qtdParcelasPagas the qtdParcelasPagas to set
	 */
	public void setQtdParcelasPagas(Integer qtdParcelasPagas) {
		this.qtdParcelasPagas = qtdParcelasPagas;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
