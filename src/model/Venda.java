package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
	private Cliente cliente;
	private Double valorTotal;
	private Date dataVenda;
	private List<Produto> produtos = new ArrayList<>();
	
	public Venda(Cliente cliente, Double valorTotal, Date dataVenda) {
		super();
		this.cliente = cliente;
		this.valorTotal = valorTotal;
		this.dataVenda = dataVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	//metodo que adiciona produto a lista de produto
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	
}
