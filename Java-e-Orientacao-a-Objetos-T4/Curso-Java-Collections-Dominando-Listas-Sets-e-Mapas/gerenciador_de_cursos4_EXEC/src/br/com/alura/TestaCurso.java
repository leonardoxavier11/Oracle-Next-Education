package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Aprendendo POO em Java", "Paulo Vieira");

		javaColecoes.adiciona((new Aula("Aula01", 21)));
		javaColecoes.adiciona((new Aula("Aula02", 15)));
		javaColecoes.adiciona((new Aula("Aula03", 36)));
		javaColecoes.adiciona((new Aula("Aula03", 9)));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
//		Collections.sort(aulasImutaveis); //Só para mostrar que não é possível fazer nada que modifique a list

		System.out.println(javaColecoes.getNome());
		aulasImutaveis.forEach(aula -> System.out.println(aula));

		System.out.println("-------");

		List<Aula> aulas = new ArrayList<>(aulasImutaveis); // Fiz uma cópia, que não tem o bloqueio estabelecido no
															// método "getAulas"
		aulas.sort(Comparator.comparing(Aula::getDuracao)); // Ordenação por "duração"

		System.out.println(javaColecoes.getNome());
		aulas.forEach(aula -> System.out.println(aula));
		
		System.out.println("-------");
		
		Collections.singletonList(aulas);
		
		System.out.println(javaColecoes.getNome());
		aulas.forEach(aula -> System.out.println(aula));

//		System.out.println("A carga total do curso é de: " + javaColecoes.getTempoTotal() + " horas");
//
//		System.out.println(javaColecoes); // Toda vez que chama uma class, é ativado o método toString herdado da class
//		// Object.

	}
}
