package com.loiane.cursojava.aula19;

import java.util.Random;

public class ExerciciosArray18 {

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

		int maiorNumero = vetorA[0];
		int menorNumero = vetorA[0];

		for (int i : vetorA) {
			if (i > maiorNumero) {
				maiorNumero = i;
			} else if (i < menorNumero) {
				menorNumero = i;
			}
		}

		System.out.println("Maior número do Array é: " + maiorNumero);
		System.out.println("Menor número do Array é: " + menorNumero);

	}

}