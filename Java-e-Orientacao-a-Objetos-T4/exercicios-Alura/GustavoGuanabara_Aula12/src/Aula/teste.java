package Aula;

public class teste {

	public static void main(String[] args) {

		Mamifero n = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();

		n.locomover();
		r.locomover();
		p.locomover();
		a.locomover();

// Teste com duas formas de instanciar um objeto. Com a "Variável" e "Classe"
// iguais e com a "Variável" e "Classe" diferentes

		Mamifero c1 = new Canguru();

		c1.locomover();
//		c1.usarBolsa(); 	
//		|-> Não é possível utilizar o método usarBolsa(), pois ele foi criado na Classe Canguru + 
//		|-> e o nosso objeto é da Classe Mamifero, apenas tem uma variável de Canguru

		Canguru c2 = new Canguru();

		c2.locomover();
		c2.usarBolsa();

//Outro teste, agora Poliformismo com o méotod emitirSom();
		Cachorro c = new Cachorro();

		c.emitirSom(); // Cachorro
		c2.emitirSom(); // Canguru
	}

}
