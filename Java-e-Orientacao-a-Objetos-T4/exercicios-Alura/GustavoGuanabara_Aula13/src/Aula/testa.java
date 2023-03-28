package Aula;

public class testa {

	public static void main(String[] args) {

		Mamifero a = new Mamifero();
		a.emitirSom();

		Lobo l = new Lobo();
		l.emitirSom();

		Cachorro c = new Cachorro();
		c.emitirSom();

		a.setIdade(5);
		a.setCorPelo("Azul");
		a.setMembros(4);
		a.setPeso(83.4);
//		a.setFeroz("Talvez!");

		l.setIdade(6);
		l.setCorPelo("Amarelo");
		l.setMembros(5);
		l.setPeso(93.4);
		l.setFeroz("Muito!");

		c.setIdade(7);
		c.setCorPelo("Verde");
		c.setMembros(6);
		c.setPeso(13.4);
		c.setFeroz("Não");

		System.out.println(a.toString());
		System.out.println(l.toString());
		System.out.println(c.toString());

		System.out.println("----------------------------");

		c.reagir("olá");
		c.reagir("Vai apanhar");
		c.reagir(false);
		c.reagir(true);
	}

}
