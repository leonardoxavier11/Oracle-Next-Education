package com.loiane.cursojava.aula36.labs;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private String nome;
	private List<Contato> contatos = new ArrayList<Contato>(); // Toda agenda já será criada com um ArraList de contatos

	public Agenda(String nome) {
		this.nome = nome;
	}

	public void adicionarContato(Contato contato) {
		contatos.add(contato);
		System.out.println("\nContato adicionado com sucesso\n");
	}

	public String mostrarTodosContatos() {
		return "Agenda [nome=" + nome + ", contatos=" + contatos + "]";
	}

//	@Override
//	public String toString() {
//		return "Agenda [nome=" + nome + ", contatos=" + contatos + "]";
//	}

}
