package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Realmente a POO segue uma ordem natural !
public class testa {

	public static void main(String[] args) {

		// Instanciando o curso
		Curso javaColecoes = new Curso("Estudando Java Básico", "Paulo Silveira");

		// Instanciando a Aula e as adiciona no curso
		javaColecoes.adiciona(new Aula("Aula01 - Fundamentos", 20));

		// Instanciando os alunos
		Aluno a1 = new Aluno("Leonardo", 1234);
		Aluno a2 = new Aluno("Mariane", 4321);

		// E os matricula no curso
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);

		// Imprimindo o consolidado da class Curso
		System.out.println(javaColecoes);

//		nomes.add("Paulo"); // Teste de UnsupportedOperationException

		// Verificar se a2 está matriculado no curso
		System.out.println(javaColecoes.estaMatriculado(a2));

		// Instanciando um conjunto que sempre será vazio, não aceita operações
		Set<Aluno> nomes = Collections.emptySet();

		try {
			nomes.add(a1);
		} catch (Exception e) {
			System.out
					.println("nomes é uma variável de um conjunto que sempre será vazio, do tipo Set<Aluno>: " + nomes);
		}
		;

	}

}
