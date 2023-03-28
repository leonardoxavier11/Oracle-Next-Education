package Aula;

public class Mamifero extends Animal {

	private String corPelo;

	@Override
	public void emitirSom() {

		System.out.println("Som de Mamifero");
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public String toString() {
		return "Mamifero [corPelo=" + corPelo + ", toString()=" + super.toString() + "]";
	}
	
	

	
}
