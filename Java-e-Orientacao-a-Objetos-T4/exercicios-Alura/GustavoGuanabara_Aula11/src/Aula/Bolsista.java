package Aula;

public class Bolsista extends Aluno {

	private boolean bolsa = true;

	public Bolsista(String nome, int idade, String sexo, int matricula, String curso) {
		super(nome, idade, sexo, matricula, curso);

	}

	public void renovarBolsa() {
		if (bolsa) {
			System.out.println(super.getNome() + ", Bolsa Renovada!");
		} else {
			System.out.println(super.getNome() + " Não é bolsista");
		}

	}

	@Override
	public void pagarMensalidade() {

		if (bolsa) {
			System.out.println("\n" + super.getNome() + " Pagou a mensalidade Com 50% de desconto");
		} else {
			super.pagarMensalidade();
		}
	}

	@Override
	public String toString() {
		return " [bolsa=" + bolsa + ", getMatricula()=" + getMatricula() + "\n, getCurso()=" + getCurso()
				+ super.toString() + "]";
	}

	public boolean isBolsa() {
		return bolsa;
	}

	public void setBolsa(boolean bolsa) {
		this.bolsa = bolsa;
	}

}
