package validandoPlaca;

import java.util.Objects;

public class Placa {
	private String placa;

	public Placa(String placa) {
		if (placa == null) {
			throw new IllegalArgumentException("Placa não pode ser nula");
		}

		this.placa = placa;
		retiraEspeciais(); // Invocado o método no construtor

		if (!this.placa.equals(this.placa.toUpperCase())) {
			sempreMaiusculo(); // Invocado o método no construtor, se não estiver em maiusculo
		}

	}

	public void sempreMaiusculo() {
		this.placa = placa.toUpperCase(); // Método para sempre colocar os caracteres em maiusculo
	}

	public void retiraEspeciais() {
		this.placa = placa.replaceAll("[^a-zA-Z0-9]", ""); // Método para substituir os caracteres especials por nada
	}

	public boolean valida() {
		boolean valido = true;

		if (placa.length() != 7) {
			throw new PlacaIncorretaException("Placa não tem 7 caracters");
		}

		if (!placa.substring(0, 3).matches("[A-Z]*")) {
			throw new PlacaIncorretaException("Algum problema nos 3 primeiros caracteres");
		}
		if (!placa.substring(3).matches("[0-9]*")) {
			throw new PlacaIncorretaException("Algum problema nos 4 últimos caracteres");
		}
		return valido;
	}

//	@Override
//	public String toString() {
//		return " Placa [placa=" + placa + "]";
//	}

	public String getPlaca() {
		return placa;
	}
	

//	@Override
//	public int hashCode() {
//		return Objects.hash(placa);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Placa other = (Placa) obj;
//		return Objects.equals(placa, other.placa);
//	}

}
