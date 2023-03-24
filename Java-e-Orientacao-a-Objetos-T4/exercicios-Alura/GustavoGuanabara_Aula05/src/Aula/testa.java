package Aula;

public class testa {

	public static void main(String[] args) {
		Conta conta01 = new Conta(1234, "cp", "Leonardo");
		conta01.estadoAtual();

		conta01.fecharConta();

		conta01.sacar(150.0);
		conta01.estadoAtual();

		conta01.depositar(135.0);
		conta01.estadoAtual();

		conta01.fecharConta();

		conta01.sacar(150.0);
		conta01.estadoAtual();

		conta01.fecharConta();

		conta01.depositar(15.0);
		conta01.estadoAtual();
		
		conta01.pagarMensal();
		conta01.estadoAtual();
		
		conta01.fecharConta();
		
		conta01.depositar(20.0);
		conta01.estadoAtual();
		
		conta01.fecharConta();
		conta01.estadoAtual();
		
		conta01.depositar(10.0);
		
		conta01.fecharConta();
		
		conta01.estadoAtualCompleto();
	}

}
