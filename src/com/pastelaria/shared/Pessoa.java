package com.pastelaria.shared;

public abstract class Pessoa {
	protected String Nome;
	protected String Usuário;
	protected String Senha;
	protected int Celular;
	protected String Email;
	protected String Cidade;
	protected String Bairro;
	protected String Rua;
	protected int Numerocasa;
	protected String Complemento;
	protected String Observação;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getUsuário() {
		return Usuário;
	}
	public void setUsuário(String usuário) {
		Usuário = usuário;
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
	public String getObservação() {
		return Observação;
	}
	public void setObservação(String observação) {
		Observação = observação;
	}
	
}
