package bytebank_herdado_conta;

public class TesteContas {

	public static void main(String[] args) {

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
	}

}
