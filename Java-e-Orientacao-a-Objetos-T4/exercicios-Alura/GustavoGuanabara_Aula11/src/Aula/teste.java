package Aula;

public class teste {

	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		v1.setNome("Murilo");
		v1.setIdade(1);
		v1.setSexo("M");
		System.out.println(v1.toString());

		System.out.println("\n--------\n");

		Bolsista b1 = new Bolsista("Leonardo", 30, "M", 1234, "Matematica");

		b1.pagarMensalidade();
		b1.renovarBolsa();
		System.out.println(b1.toString());

		System.out.println("\n--------\n");

		Bolsista b2 = new Bolsista("Mariane", 32, "F", 4321, "Programacao");

		b2.setBolsa(false);
		b2.pagarMensalidade();
		b2.renovarBolsa();
		System.out.println(b2.toString());

		System.out.println("\n--------\n");

		Professor p1 = new Professor("Silas", 60, "M", "Portugues", 2000.0);
		System.out.println("Esse é o professor " + p1.getNome());
		System.out.println(p1.toString());
		p1.receberAumento(3000.5);
		System.out.println(p1.toString());
		
		System.out.println("\n--------\n");
		
		Tecnico t1 = new Tecnico("Pereira", 15, "F", 12345, "Eletrica");	
		t1.setRegistroProfissional(5555);
		System.out.println(t1.toString());
		t1.praticar();
		
		t1.setTemRegistroProf(true);
		t1.praticar();

	}

}
