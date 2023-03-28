package Aula;

public class Visualizacao {

	private Gafanhoto espectador;
	private Video filme;

	// Construtor
	public Visualizacao(Gafanhoto espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.filme.play(); // Quando instanciar com o nome do Video Assistido, irá imprimir
							// "Reproduzindo o Video" e colocar o atributo "reproduzindo" p/ "true"
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1); // Vai acrescentar +1 no atributo
																				// "TotAssistido" p/ Gafanhoto
		this.filme.setViews(this.filme.getViews() + 1); // Quando instanciar com o nome do Video, irá acrescentar +1 p/
														// views
	}

	// Getters e Setters
	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + "\n, filme=" + filme + "]";
	}

	// Metodos Especiais
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}

	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}

	public void avaliar(double porc) {
		int tot = 0;
		if (porc <= 20) {
			tot = 3;
		} else if (porc <= 50) {
			tot = 5;
		} else if (porc <= 90) {
			tot = 8;
		} else {
			tot = 10;
		}
		this.filme.setAvaliacao(tot);
	}
}
