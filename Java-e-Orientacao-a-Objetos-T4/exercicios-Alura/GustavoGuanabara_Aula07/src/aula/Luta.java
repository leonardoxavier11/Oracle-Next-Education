package aula;

import java.util.Random;

public class Luta {
	// Ao invés de utilizar um tipo primitivo de dados, por exemplo "String",
	// podemos dizer que os primeiros 2 atributos são instacias da Classe Lutador,
	// ou seja um objeto de lutador.
	// Isso é chamado de: Tipo Abstrato de Dados
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

//Metodos Publicos
	// Já que estamos utilizando Tipos Abstrados de Dados, também podemos utilizar
	// os métodos definidos na class Lutador
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
			System.out.println("A luta foi marcada! \n");
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
			System.out.println("A luta não pode ser marcada! \n");
		}
	}

	// Já que estamos utilizando Tipos Abstrados de Dados, também podemos utilizar
	// os métodos definidos na class Lutador
	public void lutar() {
		if (aprovada) {
			desafiado.apresentar();
			desafiante.apresentar();

			Random aleatorio = new Random(); // Classe da biblioteca java.util
			int vencedor = aleatorio.nextInt(3); // 0, 1, 2

			switch (vencedor) {
			case 0: // Empate
				System.out.println("Empatou! \n");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1: // Desafiado vence
				System.out.println("Vitória do " + this.desafiado.getNome() + "\n");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2: // Desafiante vence
				System.out.println("Vitória do " + this.desafiante.getNome() + "\n");
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			}
		}
	}

//Getters e Setters
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
