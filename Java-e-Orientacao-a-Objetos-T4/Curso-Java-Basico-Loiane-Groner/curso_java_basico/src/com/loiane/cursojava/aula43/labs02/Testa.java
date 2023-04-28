package com.loiane.cursojava.aula43.labs02;

import java.util.Scanner;

public class Testa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Qual o nome do Contribuinte - PF ?");
			String nome = scan.nextLine();
			System.out.println("E qual o valor?");
			double valorTributavel = scan.nextDouble();
			scan.nextLine();

			PessoaFisica pf = new PessoaFisica(nome);
			Contribuintes.setContribuintes(pf);
			pf.calcImposto(valorTributavel);
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Qual o nome do Contribuinte - PJ ?");
			String nome = scan.nextLine();
			System.out.println("E qual o valor?");
			double valorTributavel = scan.nextDouble();
			scan.nextLine();

			PessoaJuridica pj = new PessoaJuridica(nome);
			Contribuintes.setContribuintes(pj);
			pj.calcImposto(valorTributavel);
		}

		Contribuintes.status();

		System.out.println(Contribuintes.getImpostoTotal());

	}

}
