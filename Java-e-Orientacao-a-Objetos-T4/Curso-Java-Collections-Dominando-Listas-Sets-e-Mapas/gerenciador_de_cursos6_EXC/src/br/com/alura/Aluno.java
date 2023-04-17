package br.com.alura;

import java.util.Objects;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", Matricula:" + this.numeroMatricula + "]";
	}

	// Para nós, dois alunos são iguais se ambos tiverem o mesmo nome. Não é
	// possível usar o da class String, pois estamos trabalhando com obj
	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals(outroAluno.nome);
	}

	// Modificando o método hashCode e usando o já existente na class String, que é
	// bem eficiente
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

}
