package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class testa2 {

	public static void main(String[] args) {

		// Instanciando o curso
		Curso javaColecoes = new Curso("Estudando Java Básico", "Paulo Silveira");

		// Instanciando a Aula e as adiciona no curso
		javaColecoes.adiciona(new Aula("Aula01 - Fundamentos", 20));

		// Instanciando os alunos
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Mariane", 4321);

		// E os matricula no curso
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);

		// Testes
		System.out.println(javaColecoes.estaMatriculado(a1));

		// Testes 2
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));

		// Teste 3
		Aluno aluno = new Aluno("Douglas Quintanilha", 11824763);
		Aluno alunoQueVeioDoFormulario = new Aluno("Douglas Quintanilha", 11824763);

		System.out.println("O aluno e igual ao aluno que veio do formulario?");
		System.out.println(aluno == alunoQueVeioDoFormulario); // O operador == compara as se as referências são as
																// mesmas. Ou seja, não são os mesmo objetos, são
																// objetos distintos.

		System.out.println(aluno.equals(alunoQueVeioDoFormulario)); // Já o equals faz a comparação baseado em um
																	// critério determinado por vc no método equals.

		// Teste 4 - Com equals reescrito
		System.out.println(a1.equals(turini)); // Antes de reescrever o "equals" a saída era: false. Após é: true

	}

}
