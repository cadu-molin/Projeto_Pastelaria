package com.pastelaria.shared;

public abstract class Pedido {
	protected int NumerodoPedido;
	protected String Situa��o;
	protected String Produtos;
	protected int Quantidade;
	protected double ValorUnit�rio;
	protected double ValorTotal;
	public int getNumerodoPedido() {
		return NumerodoPedido;
	}
	public void setNumerodoPedido(int numerodoPedido) {
		NumerodoPedido = numerodoPedido;
	}
	public String getSitua��o() {
		return Situa��o;
	}
	public void setSitua��o(String situa��o) {
		Situa��o = situa��o;
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
	public double getValorUnit�rio() {
		return ValorUnit�rio;
	}
	public void setValorUnit�rio(double valorUnit�rio) {
		ValorUnit�rio = valorUnit�rio;
	}
	public double getValorTotal() {
		return ValorTotal;
	}
	public void setValorTotal(double valorTotal) {
		ValorTotal = valorTotal;
	}
	
}
