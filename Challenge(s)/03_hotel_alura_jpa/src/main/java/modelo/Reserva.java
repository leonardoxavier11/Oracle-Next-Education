package modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "reservas")
public class Reserva {

	@Id
	private Long Id;
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	@Transient
	private double valorDiaria = 20;
	private double valorTotalReserva;
	private String formaDePagamento;
	private Long idCliente;

	public Reserva() {// Hibernate requer um construtor padrão
	}

	public Reserva(LocalDate dataEntrada, LocalDate dataSaida, Long idCliente) {
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.idCliente = idCliente;
		gerarIdReserva();
	}

	public Reserva(Long id2) {
		this.idCliente = id2;
	}

	public void calcularValorReservaPelosDias() {
		long diferencaDias = ChronoUnit.DAYS.between(this.dataEntrada, this.dataSaida);
		this.valorTotalReserva = diferencaDias * valorDiaria;
	}

	public void gerarIdReserva() {
		Random random = new Random();
		Long idReserva = (long) (random.nextInt(1000) + 1);
		this.Id = idReserva;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public double getValorTotalReserva() {
		return valorTotalReserva;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public Long getId() {
		return Id;
	}

}
