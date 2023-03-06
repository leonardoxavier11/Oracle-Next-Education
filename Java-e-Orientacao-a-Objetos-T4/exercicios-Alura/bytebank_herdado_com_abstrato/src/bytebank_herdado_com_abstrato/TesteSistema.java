package bytebank_herdado_com_abstrato;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente Leonardo = new Gerente();
		Leonardo.setSenha(2222);

		SistemaInterno si = new SistemaInterno();

		si.autenticaSistema(Leonardo);

		Gerente Mariane = new Gerente();
		Mariane.setSenha(333);

		SistemaInterno si2 = new SistemaInterno();

		si2.autenticaSistema(Mariane);

	}

}
