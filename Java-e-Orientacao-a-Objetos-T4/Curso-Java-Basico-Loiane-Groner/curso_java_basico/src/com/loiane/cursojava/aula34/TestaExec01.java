package com.loiane.cursojava.aula34;

public class TestaExec01 {

	public static void main(String[] args) {

		Contador a = new Contador();
		Contador b = new Contador();
		Contador c = new Contador();

		System.out.println(Contador.totalContador());

		Contador d = new Contador();

		System.out.println(Contador.totalContador());
		
		Contador.zerarContador();
		
		System.out.println(Contador.totalContador());
	}

}
