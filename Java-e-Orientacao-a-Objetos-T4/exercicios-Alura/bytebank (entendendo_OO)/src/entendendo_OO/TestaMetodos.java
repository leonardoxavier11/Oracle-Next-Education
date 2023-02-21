
package entendendo_OO;

public class TestaMetodos {

	public static void main(String[] args) {

		// Através do new "NOME_DA_CLASS", estou criando uma variável que terá os
		// atributos descritos na tal da class. Neste projeto, estou criando a variável
		// "contaDoPaulo" que terá todos os atributos da Class
		// Conta (saldo, agencia, numero e titular).
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		// System.out.println(contaDoPaulo.saldo);

		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		// System.out.println(contaDoPaulo.saldo);
		// System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
		if (sucessoTransferencia) {
			// System.out.println("transferencia com sucesso");

		} else {
			// System.out.println("faltou dinheiro");

		}
		// System.out.println(contaDaMarcela.saldo);
		// System.out.println(contaDoPaulo.saldo);

		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
	}

}
