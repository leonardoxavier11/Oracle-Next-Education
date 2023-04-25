package com.loiane.cursojava.aula36.labs;

import java.util.Scanner;

public class Testa {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Bem-vindo. Entre com o nome da sua agenda: ");
		String nomeAgenda = scan.nextLine();
		Agenda agenda = new Agenda(nomeAgenda); // Agenda instanciada com o nome definido pelo usuário

		System.out.println("Agora que a agenda foi criada. Adicione três contatos nela. Digite:");

		for (int i = 0; i < 3; i++) {
			System.out.println("Informações do contato " + (i+1));
			Contato contato = Menu.menuAddContatos(); //Para cada referencia do Objeto é chamado o método static "menuAddContatos" da class Menu
			agenda.adicionarContato(contato); //Após retornar o Objeto com todas os atriburos, o mesmo será adicionado
												// no ArrayList cuja a referência é "agenda"
		}

		System.out.println(agenda.mostrarTodosContatos());

//		System.out.println(agenda.toString());

	}

}
