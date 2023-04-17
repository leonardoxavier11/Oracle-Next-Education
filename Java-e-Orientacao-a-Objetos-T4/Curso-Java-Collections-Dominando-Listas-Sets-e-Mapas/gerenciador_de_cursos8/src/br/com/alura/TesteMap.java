package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {

	public static void main(String[] args) {

		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);

		System.out.println("Para acessar as chaves(iterar) devemos executar:");
		Set<String> chaves = nomesParaIdade.keySet();
		for (String string : chaves) {
			System.out.println(string);
		}

		System.out.println("");

		System.out.println("E para pegar os valores usamos:");
		Collection<Integer> valores = nomesParaIdade.values();
		for (Integer idade : valores) {
			System.out.println(idade);
		}

		System.out.println("");

		System.out.println("Agora só falta a terceira coleção que devolve a associação: ");
//		Para tal, existe o método entrySet() e cada associação é representado através da classe Entry:
//		Repare que o método devolve um Set de Entry (respire fundo!!). Para acessar essa coleção basta usar o foreach:
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		for (Entry<String, Integer> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}

	}

}
