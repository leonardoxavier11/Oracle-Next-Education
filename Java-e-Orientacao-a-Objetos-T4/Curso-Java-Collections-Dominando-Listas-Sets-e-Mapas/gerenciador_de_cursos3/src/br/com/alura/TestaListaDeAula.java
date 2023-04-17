package br.com.alura;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revistando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 23);
		Aula a4 = new Aula("Relacionamento de listas e objetos", 15);

		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		aulas.add(a4);

//		O método toString da classe ArrayList percorre todos os elementos da lista, concatenando seus valores também de toString. Como a classe Aula não possui um toString reescrito (_override_), ele utilizará o toString definido em Object, que retorna o nome da classe, concatenado com um @ e seguido de um identificador único do objeto (referência).
		System.out.println(aulas);
		System.out.println("------");

// 		O  Collections.sort não sabe ordenar uma lista de Aula, somente String(s). De qual forma ele faria isso? Pelo nome da aula ou pela duração? Não daria para saber. 

//		Collections.sort(aulas);

//		------------------------------------	//		
//		O critério de comparação entre duas String(s), implementado na class String, é feito através do método "compareTo". O resultado da comparação é um "int", devolvendo um numero negativo ou positivo ou 0, utilizando a ordem lexicográfica como critério.
//		Por meio do compareTo, e seu retorno.. -1, 1 ou 0, podemos utiliza-lo para comparar dois objetos.
		String s1 = "paulo";
		String s2 = "silveira";
		int resultado = s1.compareTo(s2);
		System.out.println(resultado);
		System.out.println("------");

//		------------------------------------	//
		Collections.sort(aulas); // Após reescrita do método compareTo na class Aula
		System.out.println(aulas);
		System.out.println("------");

//		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		aulas.sort(Comparator.comparing(Aula::getTempo)); // Forma a partir do Java 8
		System.out.println(aulas);
		System.out.println("------");

//		OBS, o "Comparator.comparing" também serve para ordenador em ordem lexicográfica, substituindo assim o "Collections.sort(Array)"
		aulas.sort(Comparator.comparing(Aula::getTitulo));
		System.out.println(aulas);
		System.out.println("------");

//		OBS, e também serve para comparações multiplas;
		aulas.sort(Comparator.comparing(Aula::getTitulo).thenComparing(Aula::getTempo));
		System.out.println(aulas);
		System.out.println("------");

	}
}
