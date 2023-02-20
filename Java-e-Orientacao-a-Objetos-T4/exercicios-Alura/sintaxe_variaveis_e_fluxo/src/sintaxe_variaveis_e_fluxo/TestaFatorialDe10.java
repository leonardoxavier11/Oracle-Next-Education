package sintaxe_variaveis_e_fluxo;

//Nesse exercício opcional, o seu desafio é imprimir os fatoriais de 1 a 10!

public class TestaFatorialDe10 {

	public static void main(String[] args) {

		int fatorial = 0;

		for (int i = 0; i <= 10; i++) {
			if (fatorial == 0) {
				fatorial++;
				System.out.println("O fatorial de " + i + "! é: " + fatorial);
			} else {
				fatorial *= i; // fatorial = fatorial * i;
				System.out.println("O fatorial de " + i + "! é: " + fatorial);
			}

		}
	}
}
