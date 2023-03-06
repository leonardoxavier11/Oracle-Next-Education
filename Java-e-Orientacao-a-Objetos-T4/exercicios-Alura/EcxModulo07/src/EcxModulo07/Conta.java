package EcxModulo07;

public abstract class Conta {

	private String nome;
	private String cpf;
	private double saldo;

	public void deposita(double valor) {
		saldo += valor;
	}

	public void saca(double valor) {
		saldo -= valor;
	}
	
	public double getSaldo() {
		return saldo;
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
}
