package br.com.alura;

public class Testa {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Leonardo", 30);
		Funcionario f2 = new Funcionario("Murilo", 1);
		Funcionario f3 = new Funcionario("Mariane", 32);

//		Quando você criou a instância da classe TreeSet na classe Empresa, você passou como argumento o objeto OrdenaPorIdade. 
//		Isso significa que o conjunto funcionarios será SEMPRE será ordenado pela idade dos funcionários, independentemente de quando você adiciona novos funcionários
		Empresa empresa = new Empresa();

		empresa.contrata(f1);
		empresa.contrata(f2);
		empresa.contrata(f3);

		for (Funcionario string : empresa.getFuncionarios()) {
			System.out.println(string.getNome());
		}
		System.out.println("------");

		Funcionario f4 = new Funcionario("Teresa", 61);
		Funcionario f5 = new Funcionario("Fabio", 25);

		empresa.contrata(f4);
		empresa.contrata(f5);

		for (Funcionario string : empresa.getFuncionarios()) {
			System.out.println(string.getNome());
		}
		System.out.println("------");

		Funcionario f6 = new Funcionario("Luiza", 5);
		Funcionario f7 = new Funcionario("Bento", 0);

		empresa.contrata(f6);
		empresa.contrata(f7);

		for (Funcionario string : empresa.getFuncionarios()) {
			System.out.println(string.getNome());
		}
		System.out.println("------");

	}

}
