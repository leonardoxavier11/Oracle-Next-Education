package bybank_encapsulado;

//Gerente é um Funcionário, então Gerente herda da classe Funcionário através do "extends"
public class Gerente extends Funcionario {

	//Informando valores nos atributos da Class, estou dizendo que eles irão inicializar com esses valores. Caso contrário, sempre vão inicializar com 0 ou Null
	private int senha = 222;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
    public void setSenha(int senha) {
        this.senha = senha;
    }

//	public double getBonificacao() {
//		return this.salario;
//	}
}
