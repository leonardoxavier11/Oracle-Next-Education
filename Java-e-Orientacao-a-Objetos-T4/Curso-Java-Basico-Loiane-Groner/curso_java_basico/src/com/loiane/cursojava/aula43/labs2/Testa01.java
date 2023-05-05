package com.loiane.cursojava.aula43.labs01;

import java.util.Scanner;

public class Testa01 {

	public static void main(String[] args) {

//		ControleContas controle = new ControleContas();

		try (Scanner scan = new Scanner(System.in)) {
			int opcao;

			do {

				System.out.println(
						"O que você quer fazer? \n1 - Criar contas \n2 - Visualizar as contas cadastradas \n3 - Sacar um valor \n4 - Depositar um valor \n5 - Projetar um novo saldo a partir de um rendimento \n9 - Sair");
				opcao = scan.nextInt();
				scan.nextLine();

				int numConta;

				switch (opcao) {

				case 1:
					do {

						System.out.println(
								"Qual conta você quer instanciar? \n1 - Conta Poupança \n2 - Conta Especial \n3 - Sair do cadastro de contas");
						opcao = scan.nextInt();
						scan.nextLine();

						if (opcao == 1) {
							System.out.println("Entre com seu nome e saldo inicial");
							String nome = scan.nextLine();
							double saldo = scan.nextDouble();
							scan.nextLine();

							ContaPoupanca conta = new ContaPoupanca(nome, saldo);
							ControleContas.setConta(conta);
//						ControleContas.setContasPoupancas(conta);
						} else if (opcao == 2) {
							System.out.println("Entre com seu nome e saldo inicial");
							String nome = scan.nextLine();
							double saldo = scan.nextDouble();
							scan.nextLine();

							ContaEspecial conta = new ContaEspecial(nome, saldo);
							ControleContas.setConta(conta);
						} else if (opcao == 3) {
							System.out.println("Saindo do cadastro de contas e voltar ao menu inicial\n");
						} else {
							System.out.println("Opção inválida, tente novamente\n");
						}

					} while (opcao != 3);
					break;
				case 2:
//				System.out.println(ControleContas.status());
					ControleContas.status();
					break;
				case 3:
					System.out.println("Qual o numero da conta você quer sacar?");
					numConta = scan.nextInt();
					System.out.println(ControleContas.localizarSacar(numConta));
					break;
				case 4:
					System.out.println("Qual o numero da conta você quer depositar?");
					numConta = scan.nextInt();
					System.out.println(ControleContas.localizarDepositar(numConta));
					break;
				case 5:
					System.out.println(
							"Qual o numero da conta que você quer projetar quanto será o saldo, após X meses na poupança?");
					numConta = scan.nextInt();
					System.out.println(ControleContas.localizarProjetarPoupanca(numConta));
					break;
				case 9:
					System.out.println("Encerrando programa");
					break;

				default:
					break;
				}
			} while (opcao != 9);
		}

	}

}
