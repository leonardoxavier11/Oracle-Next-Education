package com.loiane.cursojava.aula36.labs02;

import java.util.Arrays;

public class Aluno {
	private String nome;
	private int matricula;
	private double[] notas = new double[4];

	public Aluno(String nome) {
		this.nome = nome;
	}

	public void notasAlunos(double notas) {
		for (int i = 0; i < this.notas.length; i++) {
			this.notas[i] = notas;
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", notas=" + Arrays.toString(notas) + "]";
	}

}
