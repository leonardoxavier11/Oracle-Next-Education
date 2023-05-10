package loja_virtual.modulo07.aula04.modelo;

public class Categoria {

	private Integer id;
	private String nome;

	public Categoria() {
	}

	public Categoria(String nome) {
		this.nome = nome;
	}

	public Categoria(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return String.format("%d - %s", this.id, this.nome);
	}

	public String getNome() {
		return nome;
	}

	public Integer getId() {
		return id;
	}

}
