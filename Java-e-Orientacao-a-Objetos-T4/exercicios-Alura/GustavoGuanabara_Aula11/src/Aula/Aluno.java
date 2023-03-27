package Aula;

public class Aluno extends Pessoa {

	private int matricula;
	private String curso;

	public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
		super.setNome(nome);
		super.setIdade(idade);
		super.setSexo(sexo);
		this.matricula = matricula;
		this.curso = curso;
	}

// Para o construtor abaixo funcionar, precisaria definir um na class "PESSOA"
//	   public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
//	        super(nome, idade, sexo);
//	        this.matricula = matricula;
//	        this.curso = curso;
//	    }

	public void pagarMensalidade() {
		System.out.println("\n" + super.getNome() + " Pagou a mensalidade Sem Desconto");
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
