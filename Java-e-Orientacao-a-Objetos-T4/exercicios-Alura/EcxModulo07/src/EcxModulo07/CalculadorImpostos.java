package EcxModulo07;

public class CalculadorImpostos {

	private double totalImposto;

//	Quando executar o registra, de um objetivo que tenha a interface "Tributavel", irá chamar o "getValorImposto" definido na classe.
//	Após, irá atualizar a variável "totalImposto".
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
