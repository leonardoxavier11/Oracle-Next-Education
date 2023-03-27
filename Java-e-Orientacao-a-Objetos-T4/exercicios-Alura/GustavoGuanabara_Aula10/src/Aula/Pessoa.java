package Aula;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;

	// Construtor
//	public Pessoa(String nome, int idade, String sexo) {
//		super();
//		this.nome = nome;
//		this.idade = idade;
//		this.sexo = sexo;
//	}

	public void fazerAniver() {
		System.out.println(this.nome + " fez aniversário!");
		this.idade++;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
