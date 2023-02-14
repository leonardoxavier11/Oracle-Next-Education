package sintaxe_variaveis_e_fluxo;

public class TestaPontoFlutuante {

	public static void main(String[] args) {
		
		//double salario;
		//salario = 1250.70;
		double salario = 1250.70;
		System.out.println("Meu salário é: " + salario);
		
		double divisao = 3.14 /2;
		System.out.println(divisao);
		
		//int com int, o resultado será int
		double divisaoComInteiros = 5 / 2;
		System.out.println(divisaoComInteiros);
		
		//double com int, o JAVA vai pegar o maior como resultado
		double NovaTentativaComDivisaoComInteiros = 5.0 / 2;
		System.out.println(NovaTentativaComDivisaoComInteiros);
		
		//int com int, o resultado será int
		int brindes = 15;
		int pessoas = 2;
		System.out.println(brindes / pessoas);
		
		//double com int, o JAVA vai pegar o maior como resultado
		int brindes2 = 15;
		double pessoas2 = 2;
		System.out.println(brindes2 / pessoas2);
	}
}
