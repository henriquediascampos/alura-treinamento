package com.br.alura.alura.model.itemPedido;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.br.alura.alura.model.pedido.Pedido;
import com.br.alura.alura.model.produto.Produto;

@Entity
public class ItemPedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@SequenceGenerator(name="mysequence", sequenceName="seq_itpe_id", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="mysequence")
	@Id
	private Long id;
	@Column
	private BigDecimal desconto;
	@Column
	private Integer quantidade;
	@Column
	private BigDecimal preco;
	
	@JoinColumn
	@ManyToOne
	private Pedido pedido;
	
	@JoinColumn
	@ManyToOne
	private Produto produto;

	public void setId(Long id) {
		this.id = id;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
