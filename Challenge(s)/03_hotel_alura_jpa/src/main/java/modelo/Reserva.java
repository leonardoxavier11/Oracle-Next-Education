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

	public Reserva() {// Hibernate requer um construtor padrão
	}

	public Reserva(LocalDate dataEntrada, LocalDate dataSaida) {
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		gerarIdReserva();
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

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public Long getId() {
		return Id;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	@Override
	public String toString() {
		return "Reserva [Id=" + Id + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida
				+ ", valorTotalReserva=" + valorTotalReserva + ", formaDePagamento=" + formaDePagamento + "]";
	}

}
