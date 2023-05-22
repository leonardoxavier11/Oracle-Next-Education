package modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hospedes")
public class Hospede {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String sobrenome;
	private LocalDate dataNascimento;
	private String nascionalidade;
	private String telefone;

	@OneToOne
	private Reserva reserva;

	public Hospede() {
	}

	public Hospede(String nome, String sobrenome, LocalDate dataNascimento, String nascionalidade, String telefone,
			Reserva reserva) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.nascionalidade = nascionalidade;
		this.telefone = telefone;
		this.reserva = reserva;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public String getNascionalidade() {
		return nascionalidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setNascionalidade(String nascionalidade) {
		this.nascionalidade = nascionalidade;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
