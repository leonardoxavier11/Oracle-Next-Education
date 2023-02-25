package bytebank_herdado;

//Gerente é um Funcionário, então Gerente herda da classe Funcionário através do "extends". Ou seja, ao herdar, a classe filha (Gerente) ganha todas as características (atributos) e todas as funcionalidades (métodos) + 
//da classe mãe (Funcionario). É importante também citar que todo Gerente (filho) é um Funcionario (mãe).

//Também vale citar que a Class Mãe também pode ser chamada de: Base Class ou Super Class
public class Gerente extends Funcionario {

	// Informando valores nos atributos da Class, estou dizendo que eles irão
	// inicializar com esses valores. Caso contrário, sempre vão inicializar com 0
	// ou Null
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

	// Não conseguimos usar o método abaixo, pois o salário está definido na Class
	// Funcionario como "private". Ou seja, só pode ser acessado dentro da Class que
	// está definido.

//	public double getBonificacao() {
//		return this.salario;
//	}

	// Para solucionar nosso problema, veremos que há um outro modificador de
	// visibilidade que está entre o private e o public, ou seja, ele nem é visível
	// somente em determinada classe, e tampouco pode ser visualizado por todos.
	// Este modificador se chama "protected".

//	public double getBonificacao() {
//		return this.salario;
//	}

	// Ao utilizar o modificador de visibilidade do atributo salário, dentro da
	// Class Mae, para "protected" resolvemos o problema, porém seguindo as boas
	// práticas devemos fazer vale o conceito chamado "reescrita".

	// Como programador, ao utilizarmos e vermos um `this.`, no
	// caso, `this.salario`, no código, somos levados a olhar para os atributos,
	// porque pensamos automaticamente que `salario` é um atributo desta classe.
	// O `this`, além de guardar a referência para mexermos nos atributos do objeto,
	// para o desenvolvedor, significa que o atributo deve estar definido nesta
	// classe. Entretanto, neste caso o salário não está definido na
	// classe `Gerente`, e sim na classe mãe, ou super classe, `Funcionario`.
	// Para deixarmos isso explícito em nosso código, ou seja, que o `salario` vem
	// da super classe, há uma outra palavra que podemos utilizar, que é `super`:

	public double getBonificacao() {
		return super.salario;
	}
	
	// Temos o método definido na classe mãe, e redefinimos este método na classe
	// filha, ou seja, fizemos a reescrita do método.
}
