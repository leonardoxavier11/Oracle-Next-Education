package com.loiane.cursojava.aula43.labs02;

public class PessoaJuridica extends Contribuintes {
	final private String TIPOCONTRIBUINTE = "Pessoa Juridica";
	private double imposto;

	public PessoaJuridica(String nome) {
		super(nome);
		super.setTipoContribuinte(this.TIPOCONTRIBUINTE);
	}

	@Override
	public double calcImposto(double baseTributavel) {
		this.imposto = baseTributavel * 0.1;
		super.setImpostoTotal(imposto);
		return this.imposto;
	}

	@Override
	public String toString() {
		return "Contribuintes [nome=" + super.getNome() + ", tipoContribuinte=" + this.TIPOCONTRIBUINTE + ", imposto="
				+ this.imposto + "]";
	}

}
