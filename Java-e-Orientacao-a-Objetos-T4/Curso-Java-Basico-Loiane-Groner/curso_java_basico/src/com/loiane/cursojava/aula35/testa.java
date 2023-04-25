package com.loiane.cursojava.aula35;

import java.util.Scanner;

public class testa {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um numero para saber o N-ésimo termo da sequência Fibonacci");
		int num = scan.nextInt();

		System.out.println("O N-ésimo termo da sequência Fibonacci do numero " + num + " é: " + Fibonacci.posicaoFibonacci(num));
		System.out.println("E a soma da sequencia é " + Fibonacci.somaFibonacci(num));
	}

}
