//Vamos testar algumas funcionalidades do Set. Tente criar um conjunto e teste se é possível adicionar o mesmo aluno duas vezes.

package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TesteAlunosSemAcentos {

	public static void main(String[] args) {

		// 1) adicione alguns alunos
		Collection<String> alunos = new HashSet<>();
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");

		// 2) imprima o tamanho da colecao
		System.out.println(alunos.size());

		// 3) tente adicionar um aluno que existe
		boolean adicionou = alunos.add("Nico");
		System.out.println("Pedro foi adicionado ao Set? " + adicionou);

		// 4) imprima novamente o tamanho da colecao
		System.out.println(alunos.size());

		// 5) tente adicionar um aluno que não existe
		boolean adicionou1 = alunos.add("Leonardo");
		System.out.println("Leonardo foi adicionado ao Set? " + adicionou1);

		// 6) imprima mais uma vez o tamanho da colecao
		System.out.println(alunos.size());

	}
}