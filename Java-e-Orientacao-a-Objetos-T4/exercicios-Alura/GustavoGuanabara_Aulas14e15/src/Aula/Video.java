package Aula;

public class Video implements AcoesVideo {

	private String titulo;
	private double avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;

	// Metodos Abstratos da Interface
	@Override
	public void play() {
		this.reproduzindo = true;
		System.out.println("Reproduzindo o Video");
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
		System.out.println("Pausando o Video");
	}

	@Override
	public void like() {
		this.curtidas++;
	}

	// Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		if (this.views <= 1) {
			this.avaliacao = avaliacao;
		} else {
			double novaAvalicao;
			novaAvalicao = ((this.avaliacao * (this.views - 1)) + avaliacao) / this.views;
			this.avaliacao = novaAvalicao;
			// Modificamos o método setters original, para que a avaliação do video seja a
			// média das avaliações recebidas e não a última recebida
		}

	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	// Construtor
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}

}
