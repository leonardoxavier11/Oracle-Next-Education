package Aula;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Exception: " + msg);
//			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
//		ArithmeticException ex = new ArithmeticException("deu errado"); 
//		throw ex;

		throw new MinhaExcecao("deu muito errado"); // Ao instanciar uma exceção, podemos passar um parametro que vai
												// funcionar como uma mensagem

//		O throw é uma palavra-chave que é usada para lançar uma exceção explicitamente

//		System.out.println("Fim do metodo2");
	}

	// --> Agora criamos a classe "MinhaExcecao", copiando o modelo da
	// "ArithmeticException", ou seja, colocando um construtor sem parametro e um
	// com parametro de String e depois adicionamos essa nova classe no "Try Catch"

}
