package principal;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import conversorMoedas.ConversorDeMoedasMenu;

public class MenuPrincipal {
	public static void main(String[] args) {

		// Instacia o scanner para colher o input do usuários
		Scanner scanner = new Scanner(System.in);
//		scanner.useLocale(Locale.US); // para forçar o scanner a usar o separador decimal ponto, independente da
		// configuração da máquina.

		System.out.println("Olá, bem vindo as opções de conversores. Por favor, digite uma das opções abaixo: ");
		System.out.println("\n[1] - Conversor de Moedas \n[2] - Conversor de Temperaturas\n");

		try {
			int opcao = scanner.nextInt();

			while (opcao != 1 && opcao != 2) {
				System.out.println("Opcao inválida");
				opcao = scanner.nextInt();
			}

			if (opcao == 1) {
				ConversorDeMoedasMenu conversor = new ConversorDeMoedasMenu();
				conversor.menu();

			} else if (opcao == 2) {
				System.out.println("Você quer converter temperaturas");
			}

		} catch (InputMismatchException e) {
			System.out.println("Você digitou algo não numerico");
		}

	}

}
