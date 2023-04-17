package br.com.alura;

public class Aula implements Comparable<Aula> {

	private String titulo;
	private int duracao;

	public Aula(String titulo, int duracao) {
		this.titulo = titulo;
		this.duracao = duracao;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracao() {
		return duracao;
	}

// É recomendado reescrever o método toString por algo que represente o estado atual da Classe.
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", " + this.duracao + " minutos]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.getTitulo());
	}

}
