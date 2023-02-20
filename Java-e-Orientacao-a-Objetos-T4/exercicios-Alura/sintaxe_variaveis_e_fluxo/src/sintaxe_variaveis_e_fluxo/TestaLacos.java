package sintaxe_variaveis_e_fluxo;

public class TestaLacos {

	public static void main(String[] args) {

		int numeroDaTabuada = 0;
		int multiplicador = 0;

		for (numeroDaTabuada = 1; numeroDaTabuada <= 10; numeroDaTabuada++) {
			for (multiplicador = 1; multiplicador <= 10; multiplicador++) {
				System.out.println(numeroDaTabuada + " X " + multiplicador + " = " + numeroDaTabuada * multiplicador);
			} System.out.println();
		}
	}
}
