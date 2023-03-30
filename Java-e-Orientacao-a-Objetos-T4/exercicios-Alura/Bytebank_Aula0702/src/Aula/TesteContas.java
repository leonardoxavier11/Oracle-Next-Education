package Aula;

public class TesteContas {

	public static void main(String[] args) {

		CalculadorImposto calc = new CalculadorImposto();

//		Instancia as contas correntes/poupanca com o método "deposita"
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(100.0);

//      Utilize o método transfere para transferir valores de uma conta para a outra: Dentro do método main
		cc.transfere(10.0, cp);

		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

//      Modificamos o método "saca" na classe da ContaCorrente para ter um desconto de 0.20, quando utilizado.

//		Instanciamos os objetos SeguroDeVida e CalculadorImposto e executamos o método para registrar o tributo à pagar e dps imprimir o valor
		SeguroDeVida s = new SeguroDeVida();
//		CalculadorImposto calc = new CalculadorImposto(); //Para que seja feito tudo corretamente o objeto CalculadorImposto deve ser a primeira coisa a ser instanciada

		calc.registra(cc);
		calc.registra(s);

		System.out.println(calc.getTotalImposto());

		cc.deposita(1000);
		calc.registra(cc);
		System.out.println(calc.getTotalImposto());

		cc.deposita(1000);
		calc.registra(cc);
		System.out.println(calc.getTotalImposto());

		cc.deposita(5000);
		calc.registra(cc);
		System.out.println(calc.getTotalImposto());
	}

}
