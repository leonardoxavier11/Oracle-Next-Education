package testesComMetodosPrivados;

public class Banco {
	public static void main(String[] args) {

		//Podemos inicializar o Objeto com alguns atributos obrigatórios, que podem ser definidos nos "contrutores".
		Cliente2 cliente = new Cliente2("Leonardo","146.950.837-01", 30);

		// Quando deixamos um atributo "private" não podemos simplismente atribuir um +
		// valor a ele de forma direto, precisamos criar um "método" e a partir dele +
		// atribuir algum valor
		System.out.println(cliente.getCpf());

		
		Cliente2 cliente2 = new Cliente2("Mariane", "117.404.497-70", 32);
		//cliente2.nome = "Mariane";
		//cliente2.idade = 32;
		//cliente2.setCpf("117.404.497-70");

		System.out.println(cliente2.getCpf());
		
		Cliente2 cliente3 = new Cliente2("Murilo", "123.456.789-10", 1);

		System.out.println(cliente3.getCpf());
		
		
		System.out.println(Cliente2.getTotal());
		//System.out.println(Cliente2.total);
	}

}