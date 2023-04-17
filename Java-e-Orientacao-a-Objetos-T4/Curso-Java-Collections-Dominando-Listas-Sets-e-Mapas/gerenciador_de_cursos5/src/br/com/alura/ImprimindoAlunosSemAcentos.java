package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

//		Nesse pequeno exemplo temos a prova que o Set não mantém a ordem de inserção. O Aluno Nico aparece como segundo elemento, mas foi adicionado por último no Set.
//
//		Por causa disso também não temos os métodos conhecidos de uma lista que usam a posição, como lista.get(1) ou lista.remove(2). Como não há uma sequência de elementos, não existe uma posição definida. Imagine que o Set é um saco no qual você não conhece o próximo elemento que sai.
	}
}
