package com.pastelaria.shared;

public abstract class Pessoa {
	protected String Nome;
	protected String Usu�rio;
	protected String Senha;
	protected int Celular;
	protected String Email;
	protected String Cidade;
	protected String Bairro;
	protected String Rua;
	protected int Numerocasa;
	protected String Complemento;
	protected String Observa��o;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getUsu�rio() {
		return Usu�rio;
	}
	public void setUsu�rio(String usu�rio) {
		Usu�rio = usu�rio;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public int getCelular() {
		return Celular;
	}
	public void setCelular(int celular) {
		Celular = celular;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getRua() {
		return Rua;
	}
	public void setRua(String rua) {
		Rua = rua;
	}
	public int getNumerocasa() {
		return Numerocasa;
	}
	public void setNumerocasa(int numerocasa) {
		Numerocasa = numerocasa;
	}
	public String getComplemento() {
		return Complemento;
	}
	public void setComplemento(String complemento) {
		Complemento = complemento;
	}
	public String getObserva��o() {
		return Observa��o;
	}
	public void setObserva��o(String observa��o) {
		Observa��o = observa��o;
	}
	
}
