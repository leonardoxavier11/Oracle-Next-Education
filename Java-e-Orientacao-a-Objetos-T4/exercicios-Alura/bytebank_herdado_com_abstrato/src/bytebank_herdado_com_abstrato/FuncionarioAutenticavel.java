package bytebank_herdado_com_abstrato;

//Não pode instanciar (criar objetos) mais dessa classe, porque é abstrata
public abstract class FuncionarioAutenticavel extends Funcionario {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
