package com.loiane.cursojava.aula34;

public class Contador {

	private static int count; // static porque é o atributo da Classe, independente de quantas instancias ele
								// tiver

	public Contador() {
		Contador.count++; // Toda vez que for instanciado, vai ser somado +1 ao contador
	}

	public static void incrementar() {
		Contador.count++;
	}

	public static int totalContador() {
		return Contador.count;
	}

	public static void zerarContador() {
		Contador.count = 0;
	}

}
