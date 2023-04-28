package com.loiane.cursojava.aula36.labs02;

import java.util.Arrays;
import java.util.Scanner;

public class Aluno {
	private String nome;
	private int matricula;
	private double[] notas = new double[4];

	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNotas() {
		return Arrays.toString(notas);
	}

	public void setNotas() {
		Scanner scan = new Scanner(System.in);

		for (int j = 0; j < 4; j++) {
			System.out.println("Agora digite a " + (j + 1) + "° nota dele:");
			double nota = scan.nextDouble();
			scan.nextLine(); // Consumir o \n deixado pelo .nextDouble();

			while (nota < 0.0 || nota > 10.0) {
				System.out.println("Nota inválida, tente novamente: ");
				nota = scan.nextDouble();
				scan.nextLine(); // Consumir o \n deixado pelo .nextDouble();
			}

			this.notas[j] = nota;
		}
	}

	public double mediaNotas() {
		double sum = 0;
		for (int i = 0; i < notas.length; i++) {
			sum += notas[i];
		}
		return sum / 4;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", notas=" + Arrays.toString(notas) + ", média="
				+ mediaNotas() + "]";
	}

}
