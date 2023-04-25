package com.loiane.cursojava.aula25;

import java.util.Arrays;

public class Aluno {

	// Atributos
	String nome;
	int matricula;
	String curso;
	String[] disciplinas;
	double[][] notas;

	// Variáveis
	String notasStr = "";

	// Métodos
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + ", disciplinas="
				+ Arrays.toString(disciplinas) + "\nnotas=\n" + notasStr + "]";
	}

	void concaternarNotas() {
		for (double[] nota : notas) {
			notasStr += Arrays.toString(nota) + "\n";
		}
//		você pode incluir o método mostrarNota() dentro do método toString(). Para fazer isso, basta modificar o método mostrarNota() para retornar uma String em vez de imprimir na saída padrão. Então, você pode chamar esse método dentro do método toString() e concatenar o resultado à String de retorno
	}

	boolean verificarAprovado(int indice) {
		double sum = 0;

		for (int i = 0; i < notas[indice].length; i++) {
			sum += notas[indice][i];
		}

		double media = sum / 4;

		if (media >= 7) {
			return true;
		}
		return false;
	}
}
