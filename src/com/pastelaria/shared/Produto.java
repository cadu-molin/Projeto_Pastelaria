package com.pastelaria.shared;

public abstract class Produto {
	protected String Descrição;
	protected String Ingredientes;
	protected double Preço;
	public String getDescrição() {
		return Descrição;
	}
	public void setDescrição(String descrição) {
		Descrição = descrição;
	}
	public String getIngredientes() {
		return Ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		Ingredientes = ingredientes;
	}
	public double getPreço() {
		return Preço;
	}
	public void setPreço(double preço) {
		Preço = preço;
	}
	
}
