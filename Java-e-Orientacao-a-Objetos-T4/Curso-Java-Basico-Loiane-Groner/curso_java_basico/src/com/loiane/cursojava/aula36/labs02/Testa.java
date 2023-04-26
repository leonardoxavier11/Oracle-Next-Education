package com.loiane.cursojava.aula36.labs02;

import java.util.Scanner;

public class Testa {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// I) Instanciando o objeto "professor","curso" e II) settando o "professor" em
		// "curso
		Professor professor1 = new Professor("José", "Programação", "jose@professorTI.com.br");
		Curso curso = new Curso("Algoritmos", 17.30);
		curso.adicionarProfessor(professor1);

		System.out.println("Quantos alunos você quer adicionar ao curso?");
		int qntAlunos = scan.nextInt();
		scan.nextLine();

		// for para receber o nome dos alunos, instanciar o objeto "aluno", com nome que
		// é um
		// parametro obrigatório do construtor, e adicionar(settar) esse aluno no curso,
		// através de método especifico
		for (int i = 0; i < qntAlunos; i++) {

			System.out.println("\nQual o nome do aluno " + (i + 1) + " ?");
			String nome = scan.nextLine();

			Aluno aluno = new Aluno(nome);
			curso.setAlunos(aluno);

			double[] notas = new double[4]; // Instanciando um Array local

			// for para instanciar o array de notas e adicionario(settar) no objeto "aluno"
			for (int j = 0; j < 4; j++) {
				System.out.println("Agora digite a " + (j + 1) + "° nota dele:");
				double nota = scan.nextDouble();
				scan.nextLine(); // Consumir o \n deixado pelo .nextDouble();

//				aluno.notas[j] = nota;
				notas[j] = nota;
			}
			aluno.setNotas(notas);
		}

		int opcao;

		do {
			System.out.println("\nEscolha entre as opções."
					+ "\n1 - Visualizar as informações dos alunos, individualmente \n2 - Visualizar a média da turma \n3 - Visualizar a quantidade de alunos na turma \n4 - Adicionar um novo aluno \n5 - Excluir um aluno da turma \n7 - Sair");
			opcao = scan.nextInt();
			scan.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("\nAlunos:");
				for (Aluno string : curso.getAlunos()) {
					System.out.println(string);
				}
				break;
			case 2:
				double sum = 0;
				for (int i = 0; i < curso.getAlunos().size(); i++) {
					sum += curso.getAlunos().get(i).mediaNotas();
				}
				double media = sum / curso.getAlunos().size();
				System.out.println("A média das notas da turma é de: " + media);
				break;
			case 3:
				System.out.println("A turma atualmente tem: " + curso.getAlunos().size() + " alunos");
				break;
			case 4:
				System.out.println("Adicionar um novo aluno"); // Fazer
				break;
			case 5:
				System.out.println("Excluir um aluno da turma"); // Fazer
				break;
			case 7:
				System.out.println("Encerrando..");
				break;
			default:
				System.out.println("Opcao inválida");
				break;
			}

		} while (opcao != 7);

//		System.out.println(curso.getAlunos().get(0).getNotas()); //Se quisesse só as informações da posição 0 do ArrayList "alunos"

//		System.out.println(curso.getAlunos().get(0)); // Se quisesse só as informações do ArrayList "alunos"
//		System.out.println(curso.getAlunos().get(0).getNome()); // Se quisesse só as informações da posição 0 do
//																// ArrayList "alunos"
//
//		System.out.println(curso.toString());// Se quisse as informações gerias do objeto "curso" (que tem dentro dele
		// um relacionamento com o objeto "professor" e um ArrayList do objeto
		// "alunos"

	}

}
