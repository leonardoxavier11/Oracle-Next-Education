package Aula02;

public class testa02 {

	public static void main(String[] args) {

//		TipoPessoa p = new TipoPessoa();
		TipoPessoa p = TipoPessoa.CLIENTE;

		System.out.println(p.name()); // NOME mesmo, veja que está em MAIUSCULO

		System.out.println(p.getNomeExibica()); // é o parametro que foi passado dentro de CLIENTE("Cliente"), veja que
												// está em minusculao
		
		System.out.println("--------");
		
		TipoPessoa pf = TipoPessoa.PF;
		
		System.out.println(pf.name());
		System.out.println(pf.getNomeExibica());
	}

}
