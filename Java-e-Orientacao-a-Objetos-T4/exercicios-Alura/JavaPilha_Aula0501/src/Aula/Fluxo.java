package Aula;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (Exception ex) {
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

//		throw new ArithmeticException("deu muito errado");
//		throw new NullPointerException("deu muito errado");
		throw new MinhaExcecao("deu muito errado");

//		O throw é uma palavra-chave que é usada para lançar uma exceção explicitamente

//		System.out.println("Fim do metodo2");
	}

	// --> Agora observamos que podemos utilizar "Exception" para capturar
	// qualquer exceção, sem necessidade de dizer se é ArithmeticExceptio ou
	// NullPointer Exception

	// --> Agora criamos a classe "MinhaExcecao", copiando o modelo da
	// "ArithmeticException", ou seja, colocando um construtor sem parametro e um
	// com parametro de String e depois adicionamos essa nova classe no "Try Catch"

}
