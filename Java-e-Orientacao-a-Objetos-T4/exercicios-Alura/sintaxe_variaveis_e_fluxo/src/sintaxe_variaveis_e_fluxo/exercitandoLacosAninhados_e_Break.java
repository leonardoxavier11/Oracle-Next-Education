package sintaxe_variaveis_e_fluxo;

public class exercitandoLacosAninhados_e_Break {

	public static void main(String args[]) {

		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				if (coluna > linha) {
					break;
					//Exemplo: Na primeira linha, quando linha = 0, e coluna chegar no valor 1. 
					//Haverá o break
				}
				//Repare que é "print" e não "println"
				System.out.print(coluna + 1);
			}
			//Comando apenas para quebrar a linha quando iniciar um novo for do "linha"
			System.out.println();
		}
	}
}
