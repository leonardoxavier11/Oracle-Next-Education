package com.loiane.cursojava.aula36.labs02;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String nome;
	private double horario;
	private Professor professor;
	private List<Aluno> alunos = new ArrayList<Aluno>();

	public Curso(String nome, double horario) {
		this.nome = nome;
		this.horario = horario;
	}

	public void adicionarProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public List<Aluno> getAlunoIndividual(int i) {
		this.alunos.get(i);
	}

	public void setAlunos(Aluno alunos) {
		this.alunos.add(alunos);
	}

	public int qntAlunos() {
		int qntoAlunos = 0;
		for (int i = 0; i < alunos.size(); i++) {
			qntoAlunos++;
		}
		return qntoAlunos;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", horario=" + horario + ", professor=" + professor + ", alunos=" + alunos + "]";
	}

}
