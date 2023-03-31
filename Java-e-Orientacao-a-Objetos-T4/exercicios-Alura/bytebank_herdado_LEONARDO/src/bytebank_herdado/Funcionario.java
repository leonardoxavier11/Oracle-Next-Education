package bytebank_herdado;

public class Funcionario {

	private String nome;
	private String cpf;
	private String cargo;
	protected double salario; // Foi necessário utilizar o modificador de visibilidade "protected", pois assim
								// é possível visualizar o atributo "salario" na Class Mãe (super class) e
								// também nos seus filhos (extends)

	public double getBonificacao() {
		return this.salario * 0.1;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
