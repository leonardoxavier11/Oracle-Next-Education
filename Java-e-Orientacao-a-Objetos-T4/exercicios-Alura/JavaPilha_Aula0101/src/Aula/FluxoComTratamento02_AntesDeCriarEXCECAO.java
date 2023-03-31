package Aula;

public class FluxoComTratamento02_AntesDeCriarEXCECAO {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception: " + msg);
			ex.printStackTrace();
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

		throw new ArithmeticException("deu errado"); // Ao instanciar uma exceção, podemos passar um parametro que vai
														// funcionar como uma mensagem
		
//		O throw é uma palavra-chave que é usada para lançar uma exceção explicitamente

//		System.out.println("Fim do metodo2");
	}

}
