package com.loiane.cursojava.aula36;

public class Testa {

	public static void main(String[] args) {

		// Instanciar Objetos
		Contato contato = new Contato("Leonardo");
		Endereco endereco = new Endereco("Geminiano", "38", "Bloco C", "22778666", "Rio de Janeiro", "RJ");
		Telefone telefone1 = new Telefone("Residencial", "21-", "9999999");
		Telefone telefone2 = new Telefone("Trabalho", "22-", "9898989");

		// Settar a referência do Objeto endereço como um atributo do Objeto contato
		contato.setEndereco(endereco);

		// Instanciando o Array "telefones(no plural) e settando os objetos já criados
		// para dentro dele
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone1;
		telefones[1] = telefone2;

		// Cidade do Objeto contato
		System.out.println(contato.getEndereco().getCidade());

		// for Each no Array "telefones"
		for (Telefone t : telefones) {
			System.out.println(t.getDdd() + t.getNumero());
		}
	}

}
