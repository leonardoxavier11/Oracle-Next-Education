package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso curso01 = new Curso("Aprendendo POO em Java", "Paulo Vieira");
		List<Aula> aulas = curso01.getAulas(); // A melhor forma de declarar o tipo de referencia de uma nova lista é
												// deixando-a mais genérica possível

		curso01.adiciona((new Aula("Aula01", 21)));
		curso01.adiciona((new Aula("Aula02", 15)));
		curso01.adiciona((new Aula("Aula03", 36)));
		try {
			curso01.getAulas().add(new Aula("Aula04", 20)); // Esse é o jeito menos elegante de adicionar
		} catch (UnsupportedOperationException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(curso01.getAulas());
		System.out.println(aulas.toString());

//		O método getAulas() da classe Curso retorna a referência para a lista de objetos do tipo Aula armazenados no objeto Curso. 
//		Quando você chama System.out.println(curso01.getAulas()), você está imprimindo a referência para essa lista de objetos. 
//		Como a classe ArrayList (que é a implementação utilizada pela lista aulas) tem uma implementação do método toString() que imprime os elementos da lista, 
//		você acaba vendo a representação textual dos objetos do tipo Aula contidos nessa lista.

		// ForEach com lambda
		aulas.forEach(aula -> System.out.println(aula));

	}
}
