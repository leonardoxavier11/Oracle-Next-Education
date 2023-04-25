package com.loiane.cursojava.aula19;

public class ExerciciosArray01 {

	public static void main(String[] args) {

		System.out.println("Criando Vetor A");
		int[] vetorA = new int[5];

		vetorA[0] = 10;
		vetorA[1] = 20;
		vetorA[2] = 30;
		vetorA[3] = 40;
		vetorA[4] = 50;

		for (int i : vetorA) {
			System.out.println(i);
		}

		System.out.println("\nCriando VetorB, com mesmos numeros do VetorA");
		int[] vetorB = new int[5];

		for (int i = 0; i < vetorA.length; i++) {
			int valor = vetorA[i];
			vetorB[i] = valor;
		}

		for (int i : vetorB) {
			System.out.println(i);
		}

	}

}
