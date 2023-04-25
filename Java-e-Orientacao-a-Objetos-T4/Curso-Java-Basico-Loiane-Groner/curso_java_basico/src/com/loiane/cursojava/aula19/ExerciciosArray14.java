

package com.loiane.cursojava.aula19;

import java.util.Random;

public class ExerciciosArray14 {

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
		int contadorImpar = 0;
		int sum = 0;

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				sum += vetorA[i];
				contadorImpar++;
			}
		}

		System.out.println("\nContagem de números no vetorA: " + sum + " e são " + contadorImpar + " numeros");
		System.out.println("A média é: " + ((double) sum / contadorImpar));
	}
}
