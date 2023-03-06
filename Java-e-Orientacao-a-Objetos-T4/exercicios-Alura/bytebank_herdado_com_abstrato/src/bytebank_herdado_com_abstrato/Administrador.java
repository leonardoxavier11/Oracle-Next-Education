package bytebank_herdado_com_abstrato;

//Administrador eh um Funcionario, Administrador herda da class FuncionarioAutenticavel & Funcionario
public class Administrador extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		return 50;
	}

}
