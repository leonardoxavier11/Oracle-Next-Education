package com.loiane.cursojava.aula24;

public class teste {

	public static void main(String[] args) {
		ContatoCelular contato1 = new ContatoCelular();

		contato1.nome = "Leonardo";
		contato1.matricula = 001;

		contato1.telefones = new int[5]; // Instanciando o Array
		contato1.telefones[0] = 975196496;
		contato1.telefones[1] = 995267717;
		contato1.telefones[2] = 33928234;

		System.out.println(contato1.nome + " está salvo na matricula " + contato1.matricula + " com os numeros: \n");

		for (int i : contato1.telefones) {
			System.out.println(i);
		}

	}

}
