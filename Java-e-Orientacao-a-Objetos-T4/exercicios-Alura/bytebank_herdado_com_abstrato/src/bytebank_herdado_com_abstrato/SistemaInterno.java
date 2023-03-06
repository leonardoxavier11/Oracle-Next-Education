package bytebank_herdado_com_abstrato;

public class SistemaInterno {

	private int senha = 2222;

	public void autenticaSistema(FuncionarioAutenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);

		if (autenticou) {
			System.out.println("Funcinou");
		} else {
			System.out.println("Não Funcionou");
		}

	}

}
