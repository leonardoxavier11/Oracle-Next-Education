package sintaxe_variaveis_e_fluxo;

public class TestaLaco2 {

	public static void main(String[] args) {
		int linha = 0;
		int coluna = 0;

		for (linha = 0; linha < 10; linha++) {
			for (coluna = 0; coluna <= linha; coluna++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
