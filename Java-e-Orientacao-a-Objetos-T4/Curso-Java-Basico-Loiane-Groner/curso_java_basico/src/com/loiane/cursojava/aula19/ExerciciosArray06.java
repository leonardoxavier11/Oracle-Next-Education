package com.loiane.cursojava.aula19;

public class ExerciciosArray06 {

	public static void main(String[] args) {

//		System.out.println("Criando Vetor A");
		int[] vetorA = new int[10];

		for (int i = 0; i < 10; i++) {
			vetorA[i] = 2 * i;
		}

//		System.out.println("\nCriando Vetor B");
		int[] vetorB = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			int valor = vetorA[i];
			vetorB[i] = valor * 2;
		}

		System.out.println("\nCriando Vetor C");
		int[] vetorC = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}

		for (int i : vetorC) {
			System.out.println(i);
		}

	}

}
