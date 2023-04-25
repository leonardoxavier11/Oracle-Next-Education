package com.loiane.cursojava.aula36.labs02;

public class Professor {

	private String nome;
	private String Dpto;
	private String email;

	public Professor(String nome, String dpto, String email) {
		this.nome = nome;
		Dpto = dpto;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", Dpto=" + Dpto + ", email=" + email + "]";
	}

}
