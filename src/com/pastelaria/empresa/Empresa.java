package com.pastelaria.empresa;

public abstract class Empresa {
	protected String Nome;
	protected int CNPJ;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
	
}
