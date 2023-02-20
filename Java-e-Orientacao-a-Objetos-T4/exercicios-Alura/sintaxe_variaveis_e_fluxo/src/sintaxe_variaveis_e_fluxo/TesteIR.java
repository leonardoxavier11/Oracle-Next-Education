package sintaxe_variaveis_e_fluxo;

public class TesteIR {

	public static void main(String[] args) {
		double salario = 3300.0;
		String aliquota = "";

		if (salario >= 1900.0 && salario <= 2800.0) {
			salario = (salario * 7.5 / 100) - 142.0;
			aliquota = "7,5";
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			salario = (salario * 15 /100) - 350.0;
			aliquota = "15";
		} else if(salario >= 3751.01 && salario <= 4664.0) {
			salario = (salario * 22.5 / 100) - 636;
			aliquota = "22,5";
		}
		
		System.out.println("O valor do desconto de IR será de " + salario + " pois a aliquiota é: " + aliquota + "%");
	}
}
