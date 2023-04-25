package com.loiane.cursojava.aula19;

import java.util.Random;

public class ExerciciosArray15 {

	public static void main(String[] args) {

//		Criando VetorA com numeros aleatórios.
		int[] vetorA = new int[10];

		// Numero aleatórios
		for (int i = 0; i < vetorA.length; i++) {
			Random random = new Random();
			int num = random.nextInt(100) + 1;

			vetorA[i] = num;
		}

		// Iterando o VetorA
		System.out.println("Numeros do vetorA: ");
		for (int i : vetorA) {
			if (i % 2 == 0) {
				System.out.println(i + " - par");
			} else {
				System.out.println(i + " - impar");
			}
		}

		// Soma dos valores do Array
		int contadorTotal = 0;
		int contadorImpar = 0;
		int contadorPar = 0;

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				contadorImpar++;
				contadorTotal++;
			} else {
				contadorPar++;
				contadorTotal++;
			}
		}

		System.out
				.println("\nNa contagem de números no vetorA, temos: " + ((double) contadorImpar / contadorTotal) * 100
						+ " % em de impares e " + ((double) contadorPar / contadorTotal) * 100 + " % em pares");
	}
}
