package com.pastelaria.shared;

public abstract class Produto {
	protected String Descri��o;
	protected String Ingredientes;
	protected double Pre�o;
	public String getDescri��o() {
		return Descri��o;
	}
	public void setDescri��o(String descri��o) {
		Descri��o = descri��o;
	}
	public String getIngredientes() {
		return Ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		Ingredientes = ingredientes;
	}
	public double getPre�o() {
		return Pre�o;
	}
	public void setPre�o(double pre�o) {
		Pre�o = pre�o;
	}
	
}
