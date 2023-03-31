package bytebank_herdado_conta;

public class ContaCorrente extends Conta {

//  Na Herança são herdados atributos/metódos, porém os construtores NÃO SÃO HERDADOS !

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);

	}

//  Vamos sobreescrever o método saca, para isso, escreva saca e utilize o atalho do eclipse CTRL + ESPAÇO e selecione a opção que contenha Override method

	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

//	Para implementar o método deposita nessa classe filho, Repare que nossas outras classes deixaram de compilar. Isso acontece devido ao fato de que agora essas classes filhas devem implementar 
//	o método deposita

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
