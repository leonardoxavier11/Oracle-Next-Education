package com.loiane.cursojava.aula43.labs01;

public class ContaPoupanca extends Conta {
	final private String tipoConta = "Conta Poupança";
	private double rendimento = 0.005;
	private double diaRendimento;

	public ContaPoupanca(String nomeCliente, double saldo) {
		super(nomeCliente, saldo);
		super.setTipoConta(tipoConta); // Não entendi a necessidade dessa linha, mas caso não exista o retorno é
										// "null".
		System.out.println("Você criou uma " + tipoConta + " que recende " + (100 * rendimento) + "% ao mês\n");
	}

	public String getTipo() {
		return tipoConta;
	}

	// Métodos
	public void calcularNovoSaldoAposMeses(int meses) {
		super.setSaldo(super.getSaldo() * ((1 + rendimento) * meses));
	}

}
