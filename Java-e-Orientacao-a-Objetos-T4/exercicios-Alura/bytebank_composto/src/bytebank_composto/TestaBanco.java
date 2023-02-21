package bytebank_composto;

public class TestaBanco {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		// A variável contaDoPaulo, tem os seguintes atributos:
		// ||
		// \/

		// double saldo;
		// int agencia;
		// int numero;
		// Cliente titular; <-- Nesse projeto, estou associando o atributo titular a
		// outra class, no caso "paulo" (Conta).

		Cliente paulo = new Cliente(); // < -- Não é necessário a variável temporária "paulo", conforme comentários
										// abaixo:
		contaDoPaulo.titular = paulo; // < -- contaDoPaulo.titular = new Cliente();

		paulo.nome = "Paulo Silveira"; // < -- contaDoPaulo.titular.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22"; // < -- contaDoPaulo.titular.cpf = "222.222.222-22";
		paulo.profissao = "programador"; // < -- contaDoPaulo.titular.profissao = "programador";

		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.saldo);

		System.out.println(contaDoPaulo.titular); // < -- Ao executarmos a aplicação veremos que o resultado será uma
													// espécie de Id (Cliente@723279cf), que possui o mesmo valor que a
													// variável paulo, afinal, trata-se da referência para um mesmo
													// objeto.
		System.out.println(paulo);

	}
}
