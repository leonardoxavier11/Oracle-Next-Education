package com.loiane.cursojava.aula19;

import java.util.Random;

public class ExerciciosArray16 {

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
			System.out.println(i);
		}

		// Soma dos valores do Array
		int sumMenorQ15 = 0;
		int contadorIgual15 = 0;
		int sumMaiorQ15 = 0;
		int contadorMaiorQ15 = 0;

		for (int i = 0; i < vetorA.length; i++) {

			// Soma de elementos menos que 15
			if (vetorA[i] < 15) {
				sumMenorQ15 += vetorA[i];
			}
			// Quantidade e elementos igual 15
			else if (vetorA[i] == 15) {
				contadorIgual15++;
			}
			// Média dos elementos maiores que 15
			else {
				sumMaiorQ15 += i;
				contadorMaiorQ15++;
			}
		}

		System.out.println("\nNa contagem de números no vetorA, temos:\n" + sumMenorQ15
				+ " = a soma dos valores dos elementos menores que 15\n" + contadorIgual15 + " elementos iguais a 15\n"
				+ ((double) sumMaiorQ15 / contadorMaiorQ15) + " = a média dos elementos maiores que 15");
	}
}
