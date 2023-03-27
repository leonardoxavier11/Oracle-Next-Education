package aula;

public class testa {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];

		p[0] = new Pessoa("Leonardo", 30, "M");
		p[1] = new Pessoa("Mariane", 31, "F");

		l[0] = new Livro("Aprendendo JAVA", "Gustavo Guanabara", 90, p[0]);
		l[1] = new Livro("Concurso Publico", "Helio dos Anjos", 180, p[1]);
		l[2] = new Livro("Aprendendo JAVA-02", "Henry Schuer", 300, p[0]);
		
		l[0].abrir();
		l[0].folhear(100);
		
		l[2].abrir();
		l[2].folhear(15);
		
		System.out.println(l[0].detalhes());
		System.out.println(l[2].detalhes());
		System.out.println(l[1].detalhes());
		
		l[2].fechar();
		System.out.println(l[2].detalhes());

	}

}
