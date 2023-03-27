package Aula;

public class Professor extends Pessoa {

	private String especialidade = "Matemática";
	private double salario;

	public void receberAumento(double v) {
		this.salario += v;
		System.out.println("\nGanhou um aumento de " + v + "!\n");
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
		super.setNome(nome);
		super.setIdade(idade);
		super.setSexo(sexo);
		this.especialidade = especialidade;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return " [especialidade=" + especialidade + ", salario=" + salario + "\n, getNome()=" + getNome()
				+ ", getIdade()=" + getIdade() + ", getSexo()=" + getSexo() + super.toString()+"]";
	}

	
}
