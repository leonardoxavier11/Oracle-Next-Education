package com.loiane.cursojava.aula35;

public class Fibonacci {

//	private static int[] num;

	public static int posicaoFibonacci(int num) {

		int i = 2;

		int[] Array = new int[num];
		Array[0] = 0;
		Array[1] = 1;

		for (; i < Array.length; i++) {
			Array[i] = Array[i - 2] + Array[i - 1];
		}

		return Array[i - 1];

	}

	public static int somaFibonacci(int num) {

		int soma = 0;
		int i = 2;

		int[] Array = new int[num];
		Array[0] = 0;
		Array[1] = 1;

		for (; i < Array.length; i++) {
			Array[i] = Array[i - 2] + Array[i - 1];
		}

		for (int sum : Array) {
			soma += sum;
		}

		return soma;
	}

}
