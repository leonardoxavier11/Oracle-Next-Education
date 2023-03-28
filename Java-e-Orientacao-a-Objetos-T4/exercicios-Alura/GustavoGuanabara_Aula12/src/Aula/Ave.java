package Aula;

public class Ave extends Animal {

	private String corPena;

	public void fazerNinho() {

		System.out.println("Construindo ninho");
	}

	// Getters e Setters
	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	// Metodos Abstratos
	@Override
	public void locomover() {
		System.out.println("Voando");

	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutas");

	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave");
	}

}
