package com.loiane.cursojava.aula19;

import java.util.Random;

public class ExerciciosArray11 {

	public static void main(String[] args) {

//		Criando VetorA com numeros aleatórios.
		int[] vetorA = new int[10];

		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			int num = random.nextInt(100) + 1;

			vetorA[i] = num;
		}

		System.out.println("Numeros do vetorA: ");
		for (int i : vetorA) {
			System.out.println(i);
		}

		// Contar pares em VetorA
		int contadorPares = 0;

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				contadorPares++;
			}
		}

		System.out.println("\nContagem de números pares no vetorA: " + contadorPares);

	}
}
