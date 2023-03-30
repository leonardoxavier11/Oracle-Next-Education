package Aula;

public class CalculadorImposto {

	private double totalImposto;

	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}

	// Getters e Setters
	public double getTotalImposto() {
		return totalImposto;
	}

	// O setters não é necessário, pois nenhum outro comando vai interferir no
	// cálculo do imposto. A classe sempre vai calcular automáticamente, quando
	// especificado algum objeto Tributável

//	public void setTotalImposto(double totalImposto) {
//		this.totalImposto = totalImposto;
//	}

}
