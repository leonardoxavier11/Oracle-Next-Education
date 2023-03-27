package Aula;

public class Teste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno a1 = new Aluno();

		p1.setNome("Leonardo");
		a1.setNome("Mariane");

		p1.setIdade(30);
		a1.setIdade(32);

		p1.setSexo("M");
		a1.setSexo("F");

		a1.setCurso("Contabilidade");

//		a1.cancelarMatr();

		System.out.println(p1.toString());
		System.out.println(a1.toString());

		a1.fazerAniver();

		System.out.println(a1.toString());
	}

}
