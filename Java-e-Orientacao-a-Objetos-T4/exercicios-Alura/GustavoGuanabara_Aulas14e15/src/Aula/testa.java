package Aula;

public class testa {

	public static void main(String[] args) {

		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 10 de JAVA");
		v[2] = new Video("Aula 15 de HTML5");

		Gafanhoto g[] = new Gafanhoto[3];
		g[0] = new Gafanhoto("Leonardo", 30, "M", "Leo");
		g[1] = new Gafanhoto("Mariane", 32, "F", "Mari");
		g[2] = new Gafanhoto("Murilo", 1, "M", "Lilo");

//		System.out.println(v[0].toString());
//		System.out.println(g[0].toString());
//		System.out.println(g[1].toString());

		Visualizacao vis = new Visualizacao(g[0], v[2]);
		vis.avaliar();
		System.out.println(vis.toString());
		
		System.out.println("----");
		
		Visualizacao vis1 = new Visualizacao(g[1], v[2]);
		vis1.avaliar();
		System.out.println(vis1.toString());
		
		System.out.println("----");
		
		Visualizacao vis2 = new Visualizacao(g[2], v[2]);
		vis2.avaliar(9);
		System.out.println(vis2.toString());
		
		System.out.println("----");
		
		Visualizacao vis3 = new Visualizacao(g[0], v[1]);
		vis3.avaliar(65.0);
		System.out.println(vis3.toString());
		
		System.out.println("----");
		
		Visualizacao vis4 = new Visualizacao(g[0], v[1]);
		vis4.avaliar(20.0);
		System.out.println(vis4.toString());
	}

}
