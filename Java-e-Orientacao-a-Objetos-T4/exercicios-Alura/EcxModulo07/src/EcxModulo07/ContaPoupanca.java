package EcxModulo07;

public class ContaPoupanca extends Conta {

//	Quando saca da ContaPoupanca há o pagamento de taxas de 20% da operação
	@Override
	public void saca(double valor) {
		double valorFinal = valor + (valor * 0.2);
		super.saca(valorFinal);
	}

}
