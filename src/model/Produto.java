package model;

import java.util.Date;

public class Produto {
	private String descricao;
	private String unidadeMedida;
	private String categoria;
	private Integer quantidade;
	private Double preco;
	private Date validade;
	
	public Produto(String descricao, String unidadeMedida, String categoria, Integer quantidade, Double preco,
			Date validade) {
		super();
		this.descricao = descricao;
		this.unidadeMedida = unidadeMedida;
		this.categoria = categoria;
		this.quantidade = quantidade;
		this.preco = preco;
		this.validade = validade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", unidadeMedida=" + unidadeMedida + ", categoria=" + categoria
				+ ", quantidade=" + quantidade + ", preco=" + preco + ", validade=" + validade + "]";
	}
	
	
}
