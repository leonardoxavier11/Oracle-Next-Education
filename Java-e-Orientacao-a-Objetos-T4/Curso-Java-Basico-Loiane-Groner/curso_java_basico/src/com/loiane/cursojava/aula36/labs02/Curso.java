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

	public void setAlunos(Aluno alunos) {
		this.alunos.add(alunos);
	}

	public int qntAlunos() {
		return alunos.size();
	}

	public void media() {
		
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", horario=" + horario + ", \n" + professor + ", \n" + alunos + "]";
	}

}
