package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class Testa {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Estudando Java Básico", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Aula01 - Fundamentos", 20));

		Aluno a1 = new Aluno("Leonardo", 1234);
		Aluno a2 = new Aluno("Mariane", 4321);
		Aluno a3 = new Aluno("Murilo", 2143);

		// E os matricula no curso
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

//		Aluno alunoBuscado = javaColecoes.buscaMatriculado(2143);
//		System.out.println(alunoBuscado);
		System.out.println(javaColecoes.buscaMatriculado(2143));

		System.out.println("Só quero o nome: ");
		System.out.println(javaColecoes.buscaMatriculado(2143).getNome());

		System.out.println("Só quero o numero de matricula: "); // Não a chave, o numero de matricula que é um atributo
																// da class Aluno
		System.out.println(javaColecoes.buscaMatriculado(2143).getNumeroMatricula());

	}

}
