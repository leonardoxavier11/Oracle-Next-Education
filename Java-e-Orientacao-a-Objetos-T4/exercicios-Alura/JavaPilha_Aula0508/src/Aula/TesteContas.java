package Aula;

public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(250.0, cp); //->Exceção

//		System.out.println("CC: " + cc.getSaldo());
//		System.out.println("CP: " + cp.getSaldo());
		
		// Teste de "saca"
		cc.saca(200.0); //->Exceção

		System.out.println("CC: " + cc.getSaldo());

	}

}
