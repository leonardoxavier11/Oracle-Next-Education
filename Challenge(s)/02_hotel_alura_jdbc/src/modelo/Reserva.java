package modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {

	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	private double valorDiaria = 20;
	private double valorTotalReserva;
	private String formaDePagamento;
	private Long idCliente;

	public Reserva(LocalDate dataEntrada, LocalDate dataSaida) {
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

	public void calcularValorReservaPelosDias() {
		long diferencaDias = ChronoUnit.DAYS.between(this.dataEntrada, this.dataSaida);
		this.valorTotalReserva = diferencaDias * valorDiaria;
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

}
