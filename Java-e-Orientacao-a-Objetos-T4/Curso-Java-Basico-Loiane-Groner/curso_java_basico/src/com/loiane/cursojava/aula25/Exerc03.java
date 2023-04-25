package com.loiane.cursojava.aula25;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Nome do Aluno");
			aluno.nome = scan.nextLine();

			System.out.println("Nome do curso");
			aluno.curso = scan.nextLine();

			System.out.println("Nome da Matricula");
			aluno.matricula = scan.nextInt();
			scan.nextLine(); // Consumir o \n pendente
//			O \n é criado porque quando o usuário digita o número da matrícula e pressiona a tecla "Enter", além do número em si, também é digitado um caractere especial de quebra de linha (\n ou CR, Carriage Return).

			System.out.println("Nome das Disciplinas");
			aluno.disciplinas = new String[3];

			for (int i = 0; i < aluno.disciplinas.length; i++) {
				aluno.disciplinas[i] = scan.nextLine();
			}

			aluno.notas = new double[3][3];

			for (int i = 0; i < aluno.disciplinas.length; i++) {
				System.out.println("Notas da Disciplina: " + aluno.disciplinas[i]);
				for (int j = 0; j < aluno.disciplinas.length; j++) {
					aluno.notas[i][j] = scan.nextDouble();
				}

			}
		}

		aluno.concaternarNotas();
		System.out.println(aluno.toString());
		
		System.out.println(aluno.verificarAprovado(1));;
	}

}
