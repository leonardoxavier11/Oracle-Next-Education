package atalhosEclipse;

public class Desenvolvedor {
	private String nome;
	private String endereco;
	private Integer idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Desenvolvedor(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Desenvolvedor [nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	
	

}
