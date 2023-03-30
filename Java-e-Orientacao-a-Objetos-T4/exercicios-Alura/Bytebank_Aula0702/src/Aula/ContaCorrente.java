package Aula;

public class ContaCorrente extends Conta implements Tributavel {
	
	private double valorAdicionado;


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
		if (super.saldo == 0.00) {
			super.saldo += valor;
		} else {
			super.saldo += valor;
			this.valorAdicionado = valor * 0.01;
		}

	}
	
//	@Override
//	public void deposita(double valor) {
//			super.saldo += valor;
//		}


	@Override
	public double getValorImposto() {
		if (this.valorAdicionado == 0.00) {
			return super.getSaldo() * 0.01;
		} else if (this.valorAdicionado > 0) {
			return this.valorAdicionado;
		}
		return 0;
	}
	
//	@Override
//	public double getValorImposto() {
//			return super.getSaldo() * 0.01;
//	}

	public double getValorAdicionado() {
		return valorAdicionado;
	}

	public void setValorAdicionado(double valorAdicionado) {
		this.valorAdicionado = valorAdicionado;
	}
	
	
}
