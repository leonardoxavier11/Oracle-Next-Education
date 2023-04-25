package com.loiane.cursojava.aula35;

public class FibonacciRecursivo {

	public static int sequenciaFibonacci(int num) {

		if (num < 2) {
			return 1;
		}

		return sequenciaFibonacci(num - 1) + sequenciaFibonacci(num - 2);
	}

}
