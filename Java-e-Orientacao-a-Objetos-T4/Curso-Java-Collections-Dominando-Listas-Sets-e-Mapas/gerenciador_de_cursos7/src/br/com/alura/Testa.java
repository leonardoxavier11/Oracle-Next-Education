package br.com.alura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Testa {

	public static void main(String[] args) {

		LinkedList<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");

//		for (String string : letras) {
//			System.out.println(string);
//		}

//		letras.forEach(string -> System.out.println(string));

		Iterator<String> iterador = letras.iterator();

		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}

	}

}
