package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class testa {

	public static void main(String[] args) {

		// Instanciando o curso
		Curso javaColecoes = new Curso("Estudando Java Básico", "Paulo Silveira");

		// Instanciando a Aula e adicionando no curso
		javaColecoes.adiciona(new Aula("Aula01 - Fundamentos", 20));

		// Instanciando os alunos
		Aluno a1 = new Aluno("Leonardo", 1234);
		Aluno a2 = new Aluno("Mariane", 4321);

		// E matriculando no curso
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);

		// Imprimindo o consolidado da class Cursod
		System.out.println(javaColecoes);

		Set<String> nomes = Collections.emptySet(); // Sempre será um conjunto vazio está destinado a ser vazio não pode
													// ser feito a operação
		nomes.add("Paulo"); // UnsupportedOperationException
	}

	// Ou seja, realmente a POO segue uma ordem natural !

}
