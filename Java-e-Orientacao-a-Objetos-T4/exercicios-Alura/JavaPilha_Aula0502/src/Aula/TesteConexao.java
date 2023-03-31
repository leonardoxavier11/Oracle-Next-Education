package Aula;

class TesteConexao {
	public static void main(String[] args) {

		Conexao con = new Conexao();
		try {
			con.fecha();
			System.out.println("Conexão fechada com sucesso.");
		} catch (ConexaoException ex) {
//			String msg = ex.getMessage(); // Foi passado msg dentro da exceção
//			System.out.println("Erro ao fechar conexão: " + msg); // Foi passado msg dentro da exceção
			ex.printStackTrace();
		} catch (ArithmeticException ex) {
			String msg = ex.getMessage();
			System.out.println("Não é possível dividir " + msg);
			ex.printStackTrace();
		}
	}
}

//EXPLICAÇÃO:

//O código abaixo não irá dá nenhuma exceção, porém como o throws está declarado no método fecha(), 
//é necessário realizar o "Try-Catch" pois está checked
//-------------------//


//class ConexaoException extends Exception {
//	// ------
//}
//
////------
//
//class Conexao {
//	public void fecha() throws ConexaoException {
//		// implementacao omitida
//	}
//}
//
////------
//
//class TesteConexao {
//	public static void main(String[] args) {
//		Conexao con = new Conexao();
//		con.fecha();
//	}
//}

//
//Basta adicionar um bloco try-catch na chamada do con.fecha() dentro do método main .
//
//
//Correto. Como a exceção é checked devemos tomar uma "atitude" no método main. Uma forma é usar try-catch:
//
//public static void main(String[] args) {
//
//    Conexao con = new Conexao();
//    try {
//     con.fecha();
//    } catch(ConexaoException ex) {
//          ex.printStackTrace();
//    }
//}COPIAR CÓDIGO
//Alternativa correta
//Na classe ConexaoException basta estender a classe RuntimeException no lugar deException.
//
//
//Correto. Desse forma a exceção se torna unchecked e o compilador não obriga mais "tomar uma atitude".
//
//Alternativa correta
//Basta adicionar throws ConexaoException na assinatura do método main.
//
//
//Correto. Como a exceção é checked devemos tomar uma "atitude" no método main. Uma forma é colocar throws na assinatura do main:
//
// public static void main(String[] args)  throws ConexaoException