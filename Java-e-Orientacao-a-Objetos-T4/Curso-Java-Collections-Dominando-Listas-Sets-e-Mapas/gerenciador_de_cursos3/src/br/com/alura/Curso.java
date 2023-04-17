package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>(); // Aqui temos uma referência chamada "aulas", do tipo List<>, que
														// vai ser responsável por fazer a ligação entre o nome da
														// variável e o objeto na memória. À direita do sinal de igual,
														// você está instanciando uma nova lista do tipo LinkedList,
														// neste caso é a lista real (criando o objeto do tipo
														// LinkedList),
														// mesmo que a referência(variável) seja só List<>.

	// Além disso, toda vez que um objeto Curso é criado, uma nova lista LinkedList
	// vazia será criada e atribuída ao atributo aulas. Isso garante que cada objeto
	// Curso tenha sua própria lista de aulas e não compartilhe a mesma lista com
	// outros objetos da mesma classe.

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
//		return aulas;
		return Collections.unmodifiableList(aulas); // Devolve uma list do tipo "read only" (imutável - não modificável)
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

}
