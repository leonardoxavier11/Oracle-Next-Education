package bytebank_herdado_conta;

public class ContaPoupanca extends Conta {

	// Na Herança são herdados atributos/metódos, porém os construtores NÃO SÃO
	// HERDADOS !
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);

	}

//	Para implementar o método deposita nessa classe filho, Repare que nossas outras classes deixaram de compilar. Isso acontece devido ao fato de que agora essas classes filhas devem implementar 
//	o método deposita

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
