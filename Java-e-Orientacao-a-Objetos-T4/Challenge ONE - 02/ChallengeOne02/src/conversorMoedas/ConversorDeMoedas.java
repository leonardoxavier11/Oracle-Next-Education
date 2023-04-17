package conversorMoedas;

import java.text.DecimalFormat;

public class ConversorDeMoedas {
	private double valorInserido;
	private DecimalFormat df = new DecimalFormat("#0.00"); // Cria um objeto DecimalFormat com duas casas decimais

	public void setValorInserido(double valorInserido) {
		this.valorInserido = valorInserido;
	}

	public String deRealParaDolar() {
		return df.format(this.valorInserido / 5.10); // Formata o resultado com duas casas decimais
	}

	public String deRealParaEuro() {
		return df.format(this.valorInserido / 5.50); // Formata o resultado com duas casas decimais
	}

	public String deRealParaLibras() {
		return df.format(this.valorInserido / 5.80); // Formata o resultado com duas casas decimais
	}

	public String deRealParaYenes() {
		return df.format(this.valorInserido * 3); // Formata o resultado com duas casas decimais
	}

	public String deRealParaWonCoreano() {
		return df.format(this.valorInserido / 3.10);// Formata o resultado com duas casas decimais
	}
}
