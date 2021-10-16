package com.pastelaria.shared;

public abstract class Pedido {
	protected int NumerodoPedido;
	protected String Situação;
	protected String Produtos;
	protected int Quantidade;
	protected double ValorUnitário;
	protected double ValorTotal;
	public int getNumerodoPedido() {
		return NumerodoPedido;
	}
	public void setNumerodoPedido(int numerodoPedido) {
		NumerodoPedido = numerodoPedido;
	}
	public String getSituação() {
		return Situação;
	}
	public void setSituação(String situação) {
		Situação = situação;
	}
	public String getProdutos() {
		return Produtos;
	}
	public void setProdutos(String produtos) {
		Produtos = produtos;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	public double getValorUnitário() {
		return ValorUnitário;
	}
	public void setValorUnitário(double valorUnitário) {
		ValorUnitário = valorUnitário;
	}
	public double getValorTotal() {
		return ValorTotal;
	}
	public void setValorTotal(double valorTotal) {
		ValorTotal = valorTotal;
	}
	
}
