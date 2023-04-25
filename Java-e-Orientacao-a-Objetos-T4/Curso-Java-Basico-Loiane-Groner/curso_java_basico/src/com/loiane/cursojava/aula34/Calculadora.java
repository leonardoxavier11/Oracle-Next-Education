package com.loiane.cursojava.aula34;

public class Calculadora {

//	private static double resultado;

	public static double somar(double a, double b) {
		return a + b;
	}

	public static double subtrair(double a, double b) {
		return a - b;
	}

	public static double dividir(double a, double b) {
		return a / b;
	}

	public static double multiplicar(double a, double b) {
		return a * b;
	}

	public static double potencia(double a, double b) {
		return Math.pow(a, b);
	}

//	public static double fatorial(double a) {
//		double resultado = 0;
//		double fatorial = 1;
//
//		for (int i = 0; i < a-1; i++) {
//			if (resultado == 0) {
//				resultado = (a * (a - fatorial));
//			} else {
//				resultado *= (a - fatorial);
//			}
//
//			fatorial++;
//		}
//		return resultado;
//	}

	public static double fatorial(double a) {
		double fatorial = 1;

		for (int i = 1; i <= a; ++i) { // Incrementa a variável "i" antes dela ser usada para multiplicar com a
										// variável "fatorial".
			fatorial *= i;
		}

		return fatorial;
	}

}
