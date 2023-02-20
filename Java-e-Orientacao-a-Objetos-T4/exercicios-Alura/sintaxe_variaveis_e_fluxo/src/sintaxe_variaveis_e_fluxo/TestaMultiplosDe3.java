package sintaxe_variaveis_e_fluxo;

//Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.

public class TestaMultiplosDe3 {

	public static void main(String[] args) {

		for (int numero = 0; numero <= 100; numero++) {
			if (numero % 3 == 0) {
				System.out.print(numero);
				System.out.print(" | ");
			}
		}
	}
}
