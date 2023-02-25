package bybank_encapsulado;

public class TesteFuncionario {

	public static void main(String[] args) {

		// Criando Funcionário-Comum
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("123.456.789-01");
		nico.setSalario(2600.00);
		nico.setCargo(" - Funcionário");

		System.out.print(nico.getNome());
		System.out.println(nico.getCargo());
		System.out.println(nico.getBonificacao());


		// Criando Gerente
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("146.950.888.11");
		g1.setSalario(5000.0);
		g1.setCargo(" - Gerente");

		System.out.print(g1.getNome());
		System.out.println(g1.getCargo());
		System.out.println(g1.getBonificacao());


		//Usando o método "setSenha" para redefinir o valor padrão estabelecido para o atributo "senha"
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(autenticou);

	}

}
