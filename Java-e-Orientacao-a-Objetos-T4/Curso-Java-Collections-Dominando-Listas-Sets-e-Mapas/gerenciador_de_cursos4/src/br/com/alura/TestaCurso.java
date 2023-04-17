package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso curso01 = new Curso("Aprendendo POO em Java", "Paulo Vieira");

		curso01.adiciona((new Aula("Aula01", 21)));
		curso01.adiciona((new Aula("Aula02", 15)));
		curso01.adiciona((new Aula("Aula03", 36)));
		
		List<Aula> aulas = curso01.getAulas(); 

	}
}
