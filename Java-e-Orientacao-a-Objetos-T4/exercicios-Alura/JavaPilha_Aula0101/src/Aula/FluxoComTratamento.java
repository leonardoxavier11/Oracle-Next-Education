package Aula;

public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
//		} catch (Exception ex) {			
		} catch (ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage(); // getMessage - > é um método padrão da classe Throwable em Java
			System.out.println("Exception: " + msg);
			ex.printStackTrace(); // printStackTrace - > é um método padrão da classe Throwable em Java

		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1"); // Ao identificar a exceção no "metodo2", o método é descartado antes de
		// chegar nessa parte
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
//			int a = i / 0; // Exceção
			Conta c = null; // Exceção
			c.deposita();
		}
		System.out.println("Fim do metodo2"); // Ao identificar a exceção no "metodo2", o método é descartado antes de
												// chegar nessa parte
	}

}

//	public static void main(String[] args) {
//		System.out.println("Ini do main");
//		metodo1();
//		System.out.println("Fim do main");
//	}
//
//	private static void metodo1() {
//		System.out.println("Ini do metodo1");
//		try {
//			metodo2();
//		} catch (ArithmeticException ex) {
//			System.out.println("Erro -> ArithmeticException");
//		}
//		System.out.println("Fim do metodo1");
//	}
//
//	private static void metodo2() {
//		System.out.println("Ini do metodo2");
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//			int a = i / 0;
//		}
//		System.out.println("Fim do metodo2");
//	}
//
//}
