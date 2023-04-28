package com.loiane.cursojava.aula43.labs01;

public class ContaPoupanca extends Conta {
	final private String TIPOCONTA = "Conta Poupança";
	private double rendimento = 0.005;
	private double diaRendimento;

	public ContaPoupanca(String nomeCliente, double saldo) {
		super(nomeCliente, saldo);
		super.setTipoConta(TIPOCONTA); // Não entendi a necessidade dessa linha, mas caso não exista o retorno é
										// "null".
		System.out.println("Você criou uma " + TIPOCONTA + " que recende " + (100 * rendimento) + "% ao mês\n");
	}

	public String getTipo() {
		return TIPOCONTA;
	}

	// Métodos
	public void calcularNovoSaldoAposMeses(int meses) {
		super.setSaldo(super.getSaldo() * ((1 + rendimento) * meses));
	}

}
