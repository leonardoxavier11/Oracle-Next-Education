package com.loiane.cursojava.aula43.labs01;

public class ContaEspecial extends Conta {
	final private String TIPOCONTA = "Conta Especial";
	private double limite = 500;
	private double taxa = 0.1;

	public ContaEspecial(String nomeCliente, double saldo) {
		super(nomeCliente, saldo);
		super.setTipoConta(TIPOCONTA); // Não entendi a necessidade dessa linha, mas caso não exista o retorno é
										// "null".
		System.out.println("Você criou uma " + TIPOCONTA + " com limite de: R$ " + limite + "\n");
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getTipo() {
		return TIPOCONTA;
	}

	// Métodos
	@Override
	public String sacar(double valor) {
		if (super.getSaldo() > 0 || super.getSaldo() >= valor) {
			super.setSaldo(super.getSaldo() - valor - (valor * taxa));
			return "Saque realizado com sucesso.Seu novo saldo é de: R$ " + super.getSaldo() + ". Pois foi descontado uma taxa de " + taxa + "%";
		} else {
			return "Não há valor disponível para fazer esse saque. Valor total: " + super.getSaldo();
		}
	}
}
