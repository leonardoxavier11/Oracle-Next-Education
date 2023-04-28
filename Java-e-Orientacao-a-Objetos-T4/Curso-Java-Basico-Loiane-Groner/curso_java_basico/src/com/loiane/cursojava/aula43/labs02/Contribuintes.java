package com.loiane.cursojava.aula43.labs02;

import java.util.HashSet;
import java.util.Set;

abstract public class Contribuintes {
	private String nome;
	private String tipoContribuinte;
	static double impostoTotal;
	static private Set<Contribuintes> contribuintes = new HashSet<>();

	public Contribuintes(String nome) {
		this.nome = nome;
	}

	abstract public double calcImposto(double baseTributavel);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static Set<Contribuintes> getContribuintes() {
		return contribuintes;
	}

	public static void setContribuintes(Contribuintes contribuintes) {
		Contribuintes.contribuintes.add(contribuintes);
	}

	public static String getImpostoTotal() {
		return "\nA soma dos impostos de todos os contribuintes é: " + impostoTotal;
	}

	public static void setImpostoTotal(double impostoTotal) {
		Contribuintes.impostoTotal += impostoTotal;
	}

	public String getTipoContribuinte() {
		return tipoContribuinte;
	}

	public void setTipoContribuinte(String tipoContribuinte) {
		this.tipoContribuinte = tipoContribuinte;
	}

	public static void status() {
		for (Contribuintes contribuintes2 : contribuintes) {
			System.out.println(contribuintes2);
		}
	}

}
