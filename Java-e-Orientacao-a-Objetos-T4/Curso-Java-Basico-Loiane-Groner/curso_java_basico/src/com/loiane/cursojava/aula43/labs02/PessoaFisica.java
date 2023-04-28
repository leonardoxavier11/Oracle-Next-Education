package com.loiane.cursojava.aula43.labs02;

public class PessoaFisica extends Contribuintes {
	final private String tipoContribuinte = "Pessoa Fisica";
	private double imposto;

	public PessoaFisica(String nome) {
		super(nome);
		super.setTipoContribuinte(this.tipoContribuinte);
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	@Override
	public double calcImposto(double baseTributavel) {
		if (baseTributavel < 1400) {
			this.imposto = baseTributavel * 0;
		} else if (baseTributavel < 2100) {
			this.imposto = (baseTributavel * 0.1) - 100;
		} else if (baseTributavel < 2800) {
			this.imposto = (baseTributavel * 0.15) - 270;

		} else if (baseTributavel < 3600) {
			this.imposto = (baseTributavel * 0.25) - 500;

		} else {
			this.imposto = (baseTributavel * 0.30) - 700;

		}
		super.setImpostoTotal(this.imposto);
		return this.imposto;

	}

	@Override
	public String toString() {
		return "Contribuintes [nome=" + super.getNome() + ", tipoContribuinte=" + this.tipoContribuinte + ", imposto="
				+ this.imposto + "]";
	}

}
