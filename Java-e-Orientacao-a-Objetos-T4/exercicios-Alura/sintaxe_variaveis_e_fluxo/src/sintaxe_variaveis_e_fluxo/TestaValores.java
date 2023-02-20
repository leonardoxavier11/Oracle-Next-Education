package sintaxe_variaveis_e_fluxo;

public class TestaValores {

	public static void main(String[] args) {

		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;

		// quanto vale o segundo?

		System.out.println(segundo);
	}
}

//Um último detalhe muito interessante sobre estas variáveis do tipo primitivo - todas aquelas que vimos exceto a String - é seu funcionamento interno. O que são guardadas na memória delas?
//Digitaremos "main" e apertaremos "Ctrl + barra de espaço" que, assim como em outros editores, tem a ver com o autocomplete

//As linguagens de programação trabalham de formas diferentes dependendo do uso de um símbolo específico, ou da existência de alguma referência, e por aí vai. Estas variáveis do tipo primitivo são trabalhadas com o valor do conteúdo, da variável, então, quando copiamos 5 para dentro de segundo, e depois copiamos 10 para primeiro, a linha segundo = primeiro; não diz nada.
//Quando se faz uma atribuição no Java, não se diz que uma variável sempre segue a outra, e sim que estamos copiando e colando valores. Deste modo, primeiro = 10; não surtirá efeito para segundo. Confirmaremos isto rodando a aplicação, pois continuaremos recebendo 5.
//Isso significa que a variável guarda um valor, e não uma referência, e este exemplo dará base para as entendermos melhor.