package testesComMetodosPrivados;

public class Banco2 {
	public static void main(String[] args) {

		// Quando deixamos um atributo "static" não podemos simplismente atribuir um +
		// valor a ele de forma direto, precisamos criar um "método" e a partir dele +
		// atribuir algum valor
		Cliente cliente = new Cliente();
		cliente.nome = "José";
		cliente.idade = 30;
		cliente.setCpf("146.950.837-01");

		System.out.println(cliente.getCpf());

		Cliente cliente2 = new Cliente();
		cliente2.nome = "Mariane";
		cliente2.idade = 32;
		cliente2.setCpf("117.404.497-70");

		System.out.println(cliente2.getCpf());
	}

}
