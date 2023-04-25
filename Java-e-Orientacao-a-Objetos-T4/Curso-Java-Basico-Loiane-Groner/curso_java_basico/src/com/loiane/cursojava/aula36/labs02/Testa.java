package com.loiane.cursojava.aula36.labs02;

import java.util.Scanner;

public class Testa {

	public static void main(String[] args) {

		Professor professor1 = new Professor("José", "Matemática", "josé@matematica.com.br");
		Curso curso = new Curso("Algoritmos", 17.30);
		curso.adicionarProfessor(professor1);

		Scanner scan = new Scanner(System.in);

		System.out.println("Qual o nome do primeiro aluno?");
		String nome = scan.nextLine();
		Aluno aluno1 = new Aluno(nome);

		System.out.println("Qual o nome do segundo aluno?");
		nome = scan.nextLine();
		Aluno aluno2 = new Aluno(nome);

		System.out.println("Qual o nome do terceiro aluno?");
		nome = scan.nextLine();
		Aluno aluno3 = new Aluno(nome);

		System.out.println("Em qual curso eles estão matriculado?");
		String cursoMatr = scan.nextLine();

		curso.setAlunos(aluno1);
		curso.setAlunos(aluno2);
		curso.setAlunos(aluno3);

		System.out.println(curso.toString());

		System.out.println("Agora me diga as notas desses alunos");

		for (int i = 0; i < curso.qntAlunos(); i++) {
			
		}
	}

}
