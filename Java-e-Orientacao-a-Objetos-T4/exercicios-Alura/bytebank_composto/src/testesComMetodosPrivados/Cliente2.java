package testesComMetodosPrivados;

public class Cliente2 {
	String nome;
	private String cpf;
	int idade;
	private static int total;

	// Abaixo estou criando os atribuitos obrigatórios para o "construtor"
	public Cliente2(String nome, String cpf, int idade) {
		total++;
		this.nome = nome;
		setCpf(cpf);
		this.idade = idade;
	}

	//Criando um método "setter", para pegar uma informação para algum atributo.
	public void setCpf(String string) {
		this.cpf = string;
	}

	//Criando um método "getter", para retornar(devolver) uma informação de algum atributo.
	public String getCpf() {
		return this.cpf;
	}

	// Como o atributo "total" é referente a Class, não há um objeto da Class. Para
	// seu correto funcionamento é necessário coloca-lo como "static", com isso o
	// método que irá chama-lo, também precisa ser "static"
	public static int getTotal() {
		return Cliente2.total;
	}
}
