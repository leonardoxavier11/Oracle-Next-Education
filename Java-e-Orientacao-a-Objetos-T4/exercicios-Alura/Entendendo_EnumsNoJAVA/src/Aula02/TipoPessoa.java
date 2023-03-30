package Aula02;

public enum TipoPessoa {

	CLIENTE("Cliente"), FORNECEDOR("Fornecedor"), FUNCIONARIO("Funcionário"), PF("Pessoa Física"),
	PJ("Pessoa Jurídica");

	private final String nomeExibicao;

	TipoPessoa(String nomeExibicao) { // A instância do construtor está na própria classe, nesse exemplo:
										// CLIENTE("Cliente"), FORNECEDOR("Fornecedor"), FUNCIONARIO("Funcionário"),
										// PF("Pessoa Física"), PJ("Pessoa Jurídica");
		this.nomeExibicao = nomeExibicao;
	}

	public String getNomeExibica() {
		return nomeExibicao;
	}
}
