package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
//		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Vieira");
//		List<Aula> aulas = javaColecoes.getAulas();

// //		Aula a1 = new Aula("Trabalhando com ArrayList", 21);
// //		aulas.add(a1);

//		aulas.add(new Aula("Trabalhando com ArrayList", 21)); //Simplificando as 2 linhas anteriores
//
//		System.out.println(aulas);

//		System.out.println(javaColecoes.getAulas());
//		System.out.println(aulas == javaColecoes.getAulas());

		// Como as boas práticas da POO diz que só o próprio objeto pode mudar os
		// atributos desse mesmo objeto. Então vamos fazer algumas alterações no código
		// anterior

		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Vieira");
		List<Aula> aulas = javaColecoes.getAulas();

//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21)); // Simplificando a linha anterior e após
																			// bloqueio
		javaColecoes.adiciona(new Aula("Trabalhando com Linde", 15)); // Simplificando a linha anterior e após bloqueio

		System.out.println(javaColecoes.getAulas());
		System.out.println(aulas == javaColecoes.getAulas());

		System.out.println("Pecorrendo: ");
		aulas.forEach(aula -> {
			System.out.println("Aula" + aula);
		});

	}

}
