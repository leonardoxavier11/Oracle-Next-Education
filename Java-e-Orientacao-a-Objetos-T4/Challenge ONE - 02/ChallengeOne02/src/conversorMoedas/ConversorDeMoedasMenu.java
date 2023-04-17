package conversorMoedas;

import java.util.Scanner;

public class ConversorDeMoedasMenu {
	private int opcao;
	Scanner scanner = new Scanner(System.in);
	private ConversorDeMoedas ConversorMoedas = new ConversorDeMoedas(); // Agregação para usar os métodos da outra
																			// Classe

	public void menu() {

		System.out.println("\nQual valor deseja converter?");
		double valorInserido = scanner.nextDouble();
		ConversorMoedas.setValorInserido(valorInserido);

		do {
			System.out.println("\nEscolha a moeda para a qual você deseja converter seu dinheiro"
					+ "\n[1] De Reais a Dólares" + "\n[2] De Reais a Euros" + "\n[3] De Reais a Libras"
					+ "\n[4] De Reais a Yenes" + "\n[5] De Reais a Won Coreano" + "\n[6] De Dólares a Reais"
					+ "\n[7] De Euros a Reais" + "\n[8] De Libras a Reais" + "\n[9] Sair");

			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.println(ConversorMoedas.deRealParaDolar());
				break;
			case 2:
				System.out.println(ConversorMoedas.deRealParaEuro());
				break;
			case 3:
				System.out.println(ConversorMoedas.deRealParaLibras());
				break;
			case 4:
				System.out.println(ConversorMoedas.deRealParaYenes());
				break;
			case 5:
				System.out.println(ConversorMoedas.deRealParaWonCoreano());
				break;
			case 9:
				System.out.println("Encerrando Programa...");
				break;
			default:
				System.out.println("Opcao Inválida");
				break;
			}
		} while (opcao != 9);
	}
}
