package testesComMetodosPrivados;

public class Cliente {
	String nome;
	private String cpf;
	int idade;
	
	public void setCpf(String string) {
		this.cpf = string;
	}
	
	public String getCpf() {
		return this.cpf;
	}
}