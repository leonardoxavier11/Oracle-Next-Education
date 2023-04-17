package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();

	// Construtor
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas); // Ao adicionarmos essa Collections, somente a classe que o método
													// foi criado, pode modifica-la.
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
//		 int tempoTotal = aulas.stream().mapToInt(Aula::getDuracao).sum();
//		 return tempoTotal;
		return aulas.stream().mapToInt(Aula::getDuracao).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + this.nome + " , tempo total: " + this.getTempoTotal() + ", \naulas: " + this.aulas + "]";
	}

}
