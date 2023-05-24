package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();

	// Bloco apenas apra ter algum dado na "lista", quando inicar a aplicação
	static {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Alura");
		lista.add(empresa1);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		lista.add(empresa2);
	}

	// Como lista é um atributo statico (da class), não pode usar o this
	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
		System.out.println(empresa.getNome() + " cadastrada");
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}
}
