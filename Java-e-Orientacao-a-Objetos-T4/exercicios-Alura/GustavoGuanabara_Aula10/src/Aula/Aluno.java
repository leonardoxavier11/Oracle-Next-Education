package Aula;

public class Aluno extends Pessoa {

	private boolean matricula = true;
	private String curso;

	public void cancelarMatr() {
		this.matricula = false;
	}

	public boolean isMatricula() {
		return matricula;
	}

	public void setMatricula(boolean matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno " + super.toString() + " matriculado=" + matricula + ", curso=" + curso + "]";
	}

}
