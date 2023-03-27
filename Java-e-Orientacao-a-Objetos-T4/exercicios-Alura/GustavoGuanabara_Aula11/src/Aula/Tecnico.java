package Aula;

public class Tecnico extends Aluno {
	private int registroProfissional;
	private boolean temRegistroProf;

	public Tecnico(String nome, int idade, String sexo, int matricula, String curso) {
		super(nome, idade, sexo, matricula, curso);

	}
	
	public void praticar() {
		if (temRegistroProf) {
			System.out.println("Estou praticando");
		} else {
			System.out.println("Não é um técnico");
		}
		
	}

	@Override
	public String toString() {
		return "Tecnico [registroProfissional=" + registroProfissional + "\n, temRegistroProf=" + temRegistroProf
				+ ", toString()=" + super.toString() + "]";
	}

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

	public boolean isTemRegistroProf() {
		return temRegistroProf;
	}

	public void setTemRegistroProf(boolean temRegistroProf) {
		this.temRegistroProf = temRegistroProf;
	}

	
	
}
