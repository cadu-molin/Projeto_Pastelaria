package com.pastelaria.shared;

public class Login {
	protected String Usuario;
	protected String Senha;
	protected boolean anonimo;
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public boolean isAnonimo() {
		return anonimo;
	}
	public void setAnonimo(boolean anonimo) {
		this.anonimo = anonimo;
	}
	
}
