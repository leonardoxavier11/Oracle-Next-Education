package bytebank_herdado_com_abstrato;

//EditorVideo eh um Funcionario, EditorVideo herda da class Funcionario
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Editor de video");
		return 150;
	}	

}
