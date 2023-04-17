package validandoPlaca;

public class Testa {

	public static void main(String[] args) {
		Placa placa01 = new Placa("FXZ-4765");

//		placa.sempreMaiusculo();

		System.out.print(placa01.valida());
		System.out.println(placa01.toString());

		Placa placa02 = new Placa("fxz-4765");

		System.out.print(placa02.valida());
		System.out.println(placa02.toString());

		System.out.println("A placa01 registrar no atributo placa é igual à placa02");
		System.out.println(placa01.getPlaca().equals(placa02.getPlaca())); // true

		System.out.println("O objeto placa01 igual à placa02, ou seja tem a mesma referência?");
		System.out.println(placa01.equals(placa02)); // false -> Se alterar o hashCode e o equals da classe Placa, vão
														// ficam iguais
		System.out.println(placa01 == placa02); // false

	}

}
