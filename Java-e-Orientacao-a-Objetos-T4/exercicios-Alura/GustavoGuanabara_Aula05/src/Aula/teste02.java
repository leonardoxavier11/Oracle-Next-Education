package Aula;

public class teste02 {

	public static void main(String[] args) {
		Conta p1 = new Conta(1111,"cc","Jubileu");
		Conta p2 = new Conta(2222,"cp","Creuza");
		
		p1.depositar(100);
		p2.depositar(500);
		
		p2.sacar(100);
		
		p1.sacar(150);
		p1.fecharConta();
		
		p1.estadoAtualCompleto();
		p2.estadoAtualCompleto();

	}

}
