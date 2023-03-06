package bytebank_herdado_com_abstrato;

//Gerente eh um Funcionario, Gerente herda da class FuncionarioAutenticavel & Funcionario
public class Gerente extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}

}
