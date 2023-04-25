package com.loiane.cursojava.aula36comArrayList;

import java.util.LinkedList;
import java.util.List;

public class Testa {

	public static void main(String[] args) {

		// Instanciar Objetos
		Contato contato = new Contato("Leonardo");
		Endereco endereco = new Endereco("Geminiano", "38", "Bloco C", "22778666", "Rio de Janeiro", "RJ");
		Telefone telefone1 = new Telefone("Residencial", "21-", "9999999");
		Telefone telefone2 = new Telefone("Trabalho", "22-", "9898989");

		// Settar a referência do Objeto endereço como um atributo do Objeto contato
		contato.setEndereco(endereco);

		// Instanciando o ArrayList e add os telefones
		List<Telefone> telefones = new LinkedList<Telefone>();
		telefones.add(telefone1);
		telefones.add(telefone2);
		contato.setTelefone(telefones);
		System.out.println(contato.getTelefone());

		// Cidade do Objeto contato
		System.out.println(contato.getEndereco().getCidade());

		// for Each no Array "telefones"
		for (Telefone t : telefones) {
			System.out.println(t.getDdd() + t.getNumero());
		}
	}

}
