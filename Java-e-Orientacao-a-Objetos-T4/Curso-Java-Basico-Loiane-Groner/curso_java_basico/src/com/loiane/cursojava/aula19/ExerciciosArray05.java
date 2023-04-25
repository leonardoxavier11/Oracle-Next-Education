package com.loiane.cursojava.aula19;

public class ExerciciosArray05 {

	public static void main(String[] args) {

		System.out.println("Criando Vetor A");
		int[] vetorA = new int[10];

		for (int i = 0; i < 10; i++) {
			vetorA[i] = 2 * i;
		}

		for (int i : vetorA) {
			System.out.println(i);
		}

		System.out.println("\nCriando Vetor B");
		int[] vetorB = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
//			int valor = vetorA[i];
//			vetorB[i] = valor * i;
			vetorB[i] = vetorA[i] * i;
		}

		for (int i : vetorB) {
			System.out.println(i);
		}

	}

}
