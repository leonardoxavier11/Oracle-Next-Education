package testesComMetodosPrivados;

public class Banco {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.nome = "José";
		cliente.idade = 49;
		cliente.setCpf("146.950.837-01");

		System.out.println(cliente.getCpf());
	}

}