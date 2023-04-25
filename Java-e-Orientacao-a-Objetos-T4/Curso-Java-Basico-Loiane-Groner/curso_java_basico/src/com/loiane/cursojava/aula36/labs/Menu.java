package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class Menu {

	static Scanner scan = new Scanner(System.in);

	public static Contato menuAddContatos() { // Este método vai retornar um Obejto do tipo "Contato"
		System.out.print("Nome: ");
		String nomeContato = scan.nextLine();

		System.out.print("Telefone: ");
		String telefone = scan.nextLine();

		System.out.print("Email: ");
		String email = scan.nextLine();

		return new Contato(nomeContato, telefone, email);
	}

}
