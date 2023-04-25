package com.loiane.cursojava.aula36;

public class Contato {

	private String nome;
	private Endereco endereco;
	private Telefone[] telefones; //Normalmente, no dia a dia, utilizamos Colletions (list or Set) ao invés de Arrays

	public Contato(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone[] getTelefone() {
		return telefones;
	}

	public void setTelefone(Telefone[] telefone) {
		this.telefones = telefone;
	}

}
