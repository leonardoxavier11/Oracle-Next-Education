package com.loiane.cursojava.aula25;

import java.util.Scanner;

public class Conta {

	int numero;
	int agencia;
	double saldo;
	boolean especial;
	double limite = 500.00;

	void sacar(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque efetuado. O saldo agora é de: " + saldo + " reais");
		} else {
			System.out.println("Não há saldo suficiente para saque. O saldo é de: " + saldo
					+ "reais. Você quer usar o limite do cheque especial?  (Escreva Sim/Não)");

			// Usando o bloco "try-wtith-resouces" para fechar o objeto "scan" após seu uso
			// e não ocorrer vazamento.
			try (Scanner scan = new Scanner(System.in)) {
				String usarChequeEspecial = scan.nextLine();

				switch (usarChequeEspecial) {
				case "Sim":
					if (limite >= (saldo + valor)) {
						limite -= (valor - saldo);
						System.out.println("Usou o cheque especial");
					} else {
						System.out.println("Não pode usar");
					}
					break;
				default:
					System.out.println("Optou por não usar o cheque especial");
					break;
				}
			}

		}
	}

	void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Deposito realizado. O saldo agora é de: " + saldo);
		}
	}

	void VerificarUsoChequeEspecial() {
		if (limite != 500.0) {
			this.especial = true;
			System.out.println("Está usando o cheque especial " + especial);
		} else {
			this.especial = false;
			System.out.println("Não está usando o cheque especial " + especial);
		}
	}
}
