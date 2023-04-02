package br.com.alura;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1); // Se você não especificar o índice, o elemento será adicionado ao final da
							// lista.
		aulas.add(aula2); // Se você não especificar o índice, o elemento será adicionado ao final da
							// lista.
		aulas.add(aula3); // Se você não especificar o índice, o elemento será adicionado ao final da
							// lista.

		System.out.println(aulas);
		System.out.println("------");

//		A classe ArrayList, ou uma de suas mães, reescreveu o método toString, para que internamente fizesse um for, concatenando os seus elementos internos separados por vírgula.

		aulas.remove(0); // Removendo elementos
		System.out.println(aulas);
		System.out.println("------");

		aulas.add(0, aula1); // Adicionando novamente o aula1, na posição 0

		System.out.println(aulas.get(2)); // Acessando elementos
		System.out.println("------");

		System.out.println(aulas.size()); // Quantos elementos(tamanho) temos no Array
		System.out.println("------");

		// Percorrendo um array, cria-se um "for", uma variável "aula" para esse escopo
		// (pode ser qualquer nome para a variável) e percorre o array "aulas"
		// salvando oq está no correspondente indice, na variável criada, imprimindo no
		// console e seguindo para a próxima, até o fim do array.

		for (String aula : aulas) { // Isso é um comando, não é um método
			System.out.println("Aula: " + aula);
		}
		System.out.println("------");
//		for (int aula = 0; aula < aulas.size(); aula++) {
//			System.out.println("Aula: " + aulas.get(aula));
//		}

		aulas.forEach(aula -> {
//			System.out.println("Percorrendo:");
			System.out.println("Aula: " + aula);
		});
		System.out.println("------");

		Collections.sort(aulas); // Ordenando a lista
		System.out.println("Depois de ordenado:");
		System.out.println(aulas);

	}
}
