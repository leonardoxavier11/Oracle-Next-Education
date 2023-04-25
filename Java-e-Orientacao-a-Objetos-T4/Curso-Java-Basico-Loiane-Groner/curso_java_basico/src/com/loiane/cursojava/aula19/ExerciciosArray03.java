package com.loiane.cursojava.aula19;

public class ExerciciosArray03 {

	public static void main(String[] args) {

		System.out.println("Criando Vetor A");
		int[] vetorA = new int[15];

		for (int i = 0; i < 15; i++) {
			vetorA[i] = 2 * i;
		}

		for (int i : vetorA) {
			System.out.println(i);
		}

		System.out.println("\nCriando Vetor B");
		int[] vetorB = new int[15];

		for (int i = 0; i < vetorA.length; i++) {
			int valor = vetorA[i];
			vetorB[i] = valor * valor;
		}

		for (int i : vetorB) {
			System.out.println(i);
		}

	}

}
