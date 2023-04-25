package com.loiane.cursojava.aula34;

import java.util.Scanner;

public class TestaExec03 {

	public static void main(String[] args) {

		int opcao;

		do {
			System.out.println("\nSelecione uma opção:" + "\n1-Converter Minutos para segundos"
					+ "\n2-Converter Horas para minutos" + "\n3-Converter Dias para horas"
					+ "\n4-Converter Semanas para dias" + "\n5-Converter Meses para dias"
					+ "\n6-Converter anos para dias " + "\n7-Encerrar programa");

			Scanner scan = new Scanner(System.in);
			opcao = scan.nextInt();

			int valor = 0;
			if (opcao != 7) {
				System.out.println("Qual será a unidade de conversão?");
				valor = scan.nextInt();
			}

			switch (opcao) {
			case 1:
				System.out.println(ConversaoDeUnidadesDeTempo.conveterMinutosParaSegundos(valor));
				break;
			case 2:
				System.out.println(ConversaoDeUnidadesDeTempo.conveterHorasParaMinutos(valor));
				break;
			case 3:
				System.out.println(ConversaoDeUnidadesDeTempo.conveterDiasParaHoras(valor));
				break;
			case 4:
				System.out.println(ConversaoDeUnidadesDeTempo.conveterSemanasParaDias(valor));
				break;
			case 5:
				System.out.println(ConversaoDeUnidadesDeTempo.conveterMesesParaDias(valor));
				break;
			case 6:
				System.out.println(ConversaoDeUnidadesDeTempo.conveterAnosParaDias(valor));
				break;
			case 7:
				System.out.println("Encerrando..");
				break;

			default:
				break;
			}

		} while (opcao != 7);

	}
}
