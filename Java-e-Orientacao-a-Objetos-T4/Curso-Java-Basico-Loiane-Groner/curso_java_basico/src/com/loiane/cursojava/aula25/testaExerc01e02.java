package com.loiane.cursojava.aula25;

public class testaExerc01e02 {

	public static void main(String[] args) {

		System.out.println("Exercício01:");
		Lampada lampada01 = new Lampada();

		lampada01.ligar();
		lampada01.status();

		lampada01.desligar();
		lampada01.status();

		System.out.println("\n");

		System.out.println("Exercício02:");
		Conta conta01 = new Conta();

		conta01.depositar(500);
		conta01.sacar(300);
		conta01.sacar(300);

		System.out.println("\n");
		
		conta01.VerificarUsoChequeEspecial();

	}

}
