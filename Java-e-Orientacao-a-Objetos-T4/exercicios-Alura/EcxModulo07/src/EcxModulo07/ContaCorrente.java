package EcxModulo07;

public class ContaCorrente extends Conta implements Tributavel {

//	Como a Classe ContaCorrente é vinculado a interface "Tributavel", obrigatoriamente precisa escrever o método definido nela. Nesse caso o "getValorImposto()"
//	O getValorImposto está multiplicando 5% do saldo e retornando o resultado
	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.05;

	}

}
