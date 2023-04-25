package com.loiane.cursojava.aula19;

import java.util.Random;

public class ExerciciosArray19 {

	public static void main(String[] args) {

//		Criando VetorA e VetorB com numeros aleatórios -> Nesse caso não gera 0
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];

		// Numero aleatórios
		for (int i = 0; i < vetorA.length; i++) {
			Random random = new Random();
			int num = random.nextInt(10) + 1;

			vetorA[i] = num;
		}

		// Outra forma de gerar numeros aleatórios -> Nesse caso gera 0
		for (int i = 0; i < vetorB.length; i++) {
			int num = (int) (Math.random() * 10);
			vetorB[i] = num;
		}

		// Iterando
		System.out.println("Numeros do vetorA: ");
		for (int i : vetorA) {
			System.out.println(i);
		}
		System.out.println("Numeros do vetorB: ");
		for (int i : vetorB) {
			System.out.println(i);
		}

//		Criando VetorC
		String[] vetorC = new String[10];

		for (int i = 0; i < vetorC.length; i++) {
			int media = (vetorA[i] + vetorB[i]) / 2;

			if (media >= 7) {
				vetorC[i] = "Aprovado";
			} else {
				vetorC[i] = "Reprovado";
			}
		}

		// Aprovado ou Reprovado -> Média 7
		for (String string : vetorC) {
			System.out.println(string);
		}

	}

}
