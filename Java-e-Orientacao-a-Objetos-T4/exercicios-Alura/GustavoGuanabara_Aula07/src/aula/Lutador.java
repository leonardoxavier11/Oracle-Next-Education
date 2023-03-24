package aula;

public class Lutador {
//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	// Trata-se de um método "private" que apenas será modificado quando estabelecer
	// o peso pelo método "setPeso"
	private void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "Inválido";
		} else if (this.getPeso() < 70.3) {
			this.categoria = "Leve";
		} else if (this.getPeso() < 83.9) {
			this.categoria = "Médio";
		} else if (this.getPeso() < 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

// Construtor
	// Detalhe importante do atributo "PESO" relacionado a atualização da
	// categoria!!
	public Lutador(String name, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
			int empates) {
		this.nome = name;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
//		this.peso = peso;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

// Metodos Publicos
	public void apresentar() {
		System.out.println("------APRESENTANDO------");
		System.out.println("Lutador: " + this.getNome() + "\n" + "Origem: " + nacionalidade + "\n" + this.getIdade()
				+ " anos " + "\n" + this.getAltura() + " altura " + "\n" + "Pesando " + this.getPeso() + " kg" + "\n"
				+ "Ganhou " + this.getVitorias() + "\n" + "Perdeu " + this.getDerrotas() + "\n" + "Empatou "
				+ this.getEmpates() + "\n");

	}

	public void status() {
		System.out.println(this.getNome() + " é um peso " + this.getCategoria() + "\n" + this.getVitorias()
				+ " vitórias" + "\n" + this.getDerrotas() + " derrotas" + "\n" + this.getEmpates() + " empates" + "\n");
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

}
