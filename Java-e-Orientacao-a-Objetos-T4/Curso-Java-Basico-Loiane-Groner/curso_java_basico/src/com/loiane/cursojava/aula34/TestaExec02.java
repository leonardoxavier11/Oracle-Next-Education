package com.loiane.cursojava.aula34;

import java.util.Scanner;

public class TestaExec02 {

	public static void main(String[] args) {

		System.out.println(Calculadora.somar(5, 5));
		System.out.println(Calculadora.potencia(-5, 3));
		System.out.println(Calculadora.dividir(1, 7));

		Scanner scan = new Scanner(System.in);
		double num;

		do {
			System.out.println("Entre com um numero positivo ou zera");
			num = scan.nextDouble();

			if (num < 0) {
				System.out.println("Numero inválido, tente novamente.");
			}

		} while (num < 0);

		System.out.println(Calculadora.fatorial(num));
	}

}
