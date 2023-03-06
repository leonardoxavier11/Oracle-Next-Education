package EcxModulo07;

public class Testa {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(500.0);
		cc.saca(200.0);
		
		System.out.println(cc.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.deposita(500.0);
		cp.saca(200.0);
		
		System.out.println(cp.getSaldo());
		
		SeguroVida seguro = new SeguroVida();
		
		CalculadorImpostos calc = new CalculadorImpostos();
		calc.registra(cc);
		calc.registra(seguro);
				
		System.out.println(calc.getTotalImposto());

	}

}
