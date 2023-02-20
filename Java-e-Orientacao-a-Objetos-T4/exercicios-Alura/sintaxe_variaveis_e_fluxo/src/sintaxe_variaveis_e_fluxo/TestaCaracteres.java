package sintaxe_variaveis_e_fluxo;

public class TestaCaracteres {

	public static void main(String[] args) {
		
		//No char precisa, obrigatoriamente, aspas simples! E pode usar apenas um caractere!
		char letra = 'a';
		System.out.println(letra);
		
		//O char guarda um valor numerico, que é representado na tabela Unicod/ASCII pela letra B. Esse é o motivo do resultado abaixo
		char valor = 66;
		System.out.println(valor);
		
		//Quando JAVA trabalha com dois tipos de variáveis, o resultado será o maior. No exemplo abaixo, como um 'int' não cabe em um 'char', será necessário fazer um Casting para "forçar" o resultado
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		//Na String precisa, obrigatoriamente, aspas duplas! E pode ter zero ou mais caracteres.
		String palavra = "Alura cursos onlince de tecnologia";
		System.out.println(palavra);
		
		//Quando concatena String com outra "coisa", ele vai converter tudo para String
		palavra = palavra + 2020;
		System.out.println(palavra);
	}
}
