package bytebank_herdado_com_abstrato;

//  Não pode instanciar (criar objetos) mais dessa classe, porque é abstrata
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

//	Método sem corpo, porque não há implementacao
	public abstract double getBonificacao();

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
