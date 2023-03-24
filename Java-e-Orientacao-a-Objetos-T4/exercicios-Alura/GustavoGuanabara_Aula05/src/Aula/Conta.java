package Aula;

public class Conta {

	private double numConta;
	private String tipo;
	private String dono;
	private double saldo;
	private boolean status;

// Construtor
	public Conta(double numConta, String tipo, String dono) {
		this.setNumConta(numConta);
		this.setTipo(tipo);
		this.setDono(dono);
		/* this.setSaldo(saldo); */ // Não é necessário utilizar o saldo aqui, pois não estamos depositando nada
									// quando a conta é aberta
		this.estadoAtual(true); // Aqui foi colocado diretamente a varia´vel "true", pois toda conta
								// inicializada deve ser verdadeiro

		this.abrirConta();
	}

// Metodos
	public void abrirConta() {
		if (this.getTipo() == "cc") {
			this.setSaldo(50.0);
		} else if (this.getTipo() == "cp") {
			this.setSaldo(150.0);
		} else {
			System.out.println("O tipo de conta que você quer abrir não é valido");
		}
	}

	public void fecharConta() {
		if (this.getStatus()) {
			if (this.getSaldo() < 0.0) {
				System.out.println("Antes de fechar a conta, você precisa quitar seus débitos");
			} else if (this.getSaldo() > 0.0) {
				System.out.println("Antes de fechar a conta, você precisa retirar todos os recursos dela");
			} else {
				System.out.println("Conta fechada com sucesso");
				this.estadoAtual(false);
			}
		} else {
			System.out.println("A conta já está fechada");
		}

	}

	public void depositar(double valor) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
		} else {
			System.out.println("A conta não está aberta");
		}

	}

	public void sacar(double valor) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - valor);
		} else {
			System.out.println("A conta não está aberta");
		}

	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "cc") {
			v = 12;
		} else if (this.getTipo() == "cp") {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
		}
	}

	public void estadoAtual() {
		System.out.println("Saldo: " + this.getSaldo() + "\n" + "Status: " + this.getStatus() + "\n");
	}

	public void estadoAtualCompleto() {
		System.out.println("\n" + "Numero da Conta: " + this.getNumConta() + "\n" + "Tipo de Conta: " + this.getTipo()
				+ "\n" + "Dono da Conta: " + this.getDono() + "\n" + "Saldo: " + this.getSaldo() + "\n" + "Status: "
				+ this.getStatus() + "\n");
	}

// Getters & Setters
	public double getNumConta() {
		return numConta;
	}

	public void setNumConta(double numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void estadoAtual(boolean status) {
		this.status = status;
	}
}
