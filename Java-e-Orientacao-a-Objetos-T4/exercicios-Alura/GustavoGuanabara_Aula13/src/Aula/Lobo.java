package Aula;

public class Lobo extends Mamifero {

	private String feroz;
	
	@Override
	public void emitirSom() {

		System.out.println("Auuuu");
	}

	public String getFeroz() {
		return feroz;
	}

	public void setFeroz(String feroz) {
		this.feroz = feroz;
	}

	@Override
	public String toString() {
		return "Lobo [feroz=" + feroz + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
