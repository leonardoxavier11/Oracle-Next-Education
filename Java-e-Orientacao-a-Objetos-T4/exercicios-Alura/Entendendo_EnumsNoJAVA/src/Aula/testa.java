package Aula;


public class testa {

	public static void main(String[] args) { // Cria o método main
		DiaDaSemana hoje = DiaDaSemana.DOMINGO; // Cria a variável hoje
		System.out.println("Hoje é " + hoje);

		switch (hoje) { // Utiliza o switch statement
		case SEGUNDA:
			System.out.println("Bom começo de semana!");
			break;
		case SEXTA:
			System.out.println("Bom final de semana!");
			break;
		default:
			System.out.println("Bom dia!");
		}
	}

}
