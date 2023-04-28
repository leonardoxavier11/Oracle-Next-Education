package com.loiane.cursojava.aula36.labs02;

import java.util.Scanner;

public class Testa {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// I) Instanciando o objeto "professor","curso" e II) settando o "professor" em
		// "curso
		Professor professor1 = new Professor("José", "Programação", "jose@professorTI.com.br");
		Curso curso = new Curso("Algoritmos", 17.30);
		curso.setProfessor(professor1);

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

			Aluno aluno = new Aluno(nome, i + 1);
			curso.setAluno(aluno);

			aluno.setNotas(); // Chamada do método "setNotas" da class aluno
		}

		int opcao;

		do {
			System.out.println("\nEscolha entre as opções."
					+ "\n1 - Visualizar as informações dos alunos, individualmente \n2 - Visualizar a média da turma \n3 - Visualizar a quantidade de alunos na turma \n4 - Adicionar um novo aluno \n5 - Excluir um aluno da turma \nAlunos aprovado, com média acima de7 \n7 - Sair");
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
				for (int i = 0; i < curso.qntAlunos(); i++) {
					sum += curso.getAlunos().get(i).mediaNotas(); // Ajustar para ficar mais bonito visualmente
																	// -> "curso.mediaNotas
				}
				double media = sum / curso.qntAlunos();
				System.out.println("A média das notas da turma é de: " + media);
				break;
			case 3:
				System.out.println("A turma atualmente tem: " + curso.qntAlunos() + " alunos");
				break;
			case 4:
				System.out.println("\nQual o nome do novo aluno ?");
				String nome = scan.nextLine();
//				int matricula = curso.qntAlunos() + 1;
				int matricula = curso.matriculaNovoAluno();
				Aluno aluno = new Aluno(nome, matricula);
				curso.setAluno(aluno);

				aluno.setNotas();
				break;
			case 5:
				System.out.println("\nQual a matricula do aluno que você quer excluir?");
				matricula = scan.nextInt();
				curso.removerAluno(matricula);
				break;
			case 6:
				System.out.println("Os alunos com média acima de 7, foram:\n"); // Fazer
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
