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
	private Long idReserva;

//	@OneToOne
//	private Reserva idReserva;

	public Hospede() {
	}

	public Hospede(String nome, String sobrenome, LocalDate dataNascimento, String nascionalidade,
			String telefone, Long idReserva) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.nascionalidade = nascionalidade;
		this.telefone = telefone;
		this.idReserva = idReserva;
	}

}
