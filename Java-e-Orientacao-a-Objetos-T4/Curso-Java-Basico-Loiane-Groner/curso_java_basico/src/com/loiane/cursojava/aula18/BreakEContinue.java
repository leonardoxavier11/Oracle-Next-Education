package com.loiane.cursojava.aula18;

import java.util.Iterator;
import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número");
		int num = scan.nextInt();

		System.out.println("Qual o divisor?");
		int div = scan.nextInt();

		System.out.println("Entre com um limite");
		int max = scan.nextInt();

		// Faça um for começando em "num" e quando encontrar o primeiro número divisível
		// por 7, sem resto, pare.
		for (int i = num; i <= max; i++) {

			if (i % div == 0) { // Quando encontrar o primeiro número divisível por 7, sem resto, pare.
				System.out.println("O valor de i é: " + i);
				break; // Se não colocar o break vai até o limite informado.
			}
		}

	}

}
