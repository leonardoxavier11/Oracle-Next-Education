package com.loiane.cursojava.aula36.labs02;

import java.util.Arrays;

public class Aluno {
	private String nome;
	private int matricula;
	private double[] notas;

	public Aluno(String nome) {
		this.nome = nome;
	}

	public void setNotas(double[] notas) { // Esse método receber um ARRAY de notas. Ou seja, um ARRAY já completo
		this.notas = notas;
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

	public double mediaNotas() {
		double sum = 0;
		for (int i = 0; i < notas.length; i++) {
			sum += notas[i];
		}
		return sum / 4;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", notas=" + Arrays.toString(notas)+", média=" + mediaNotas()
				+ "]";
	}

}
