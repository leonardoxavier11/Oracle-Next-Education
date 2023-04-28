package com.loiane.cursojava.aula36.labs02;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

	private String nome;
	private double horario;
	private Professor professor;
	private List<Aluno> alunos = new ArrayList<Aluno>();

	public Curso(String nome, double horario) {
		this.nome = nome;
		this.horario = horario;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAluno(Aluno alunos) {
		this.alunos.add(alunos);
	}

	public void removerAluno(int matricula) {
		for (Aluno aluno : alunos) {
			if (aluno.getMatricula() == matricula) {
				alunos.remove(aluno);
				return;
			}
		}
		System.out.println("Essa matricula não está associada a nenhum aluno");
	}

	public int qntAlunos() {
		return alunos.size();
	}

	public int matriculaNovoAluno() {
		if (alunos.size() != 0) {
			int index = alunos.size() - 1;
			return alunos.get(index).getMatricula() + 1;
		}
		return 1; // Não tem oq fazer, só quando tiver um banco de dados para ter histórico de
					// matriculas dos demitidos

	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", horario=" + horario + ", \n" + professor + ", \n" + alunos + "]";
	}

}
