package Ecx04;

public class Programa {

	public static void main(String args[]) {

		Pessoa p = new Pessoa();
		p.nome = "Paulo";

		p.endereco = new Endereco();
		p.endereco.logradouro = "Avenida XYZ";

		System.out.println(p.endereco.logradouro);

		p.idade = 30;
		System.out.println(p.idade);
	}
}