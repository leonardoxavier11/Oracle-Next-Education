package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Reserva;

public class ReservaDao {

	Connection con;

	public ReservaDao(Connection con) {
		this.con = con;
	}

	public void persistir(Reserva reserva) {
		String sql = "INSERT INTO reservas (data_entrada, data_saida, valor,forma_pagamento,id_usuario) VALUES (?,?,?,?,?)";

		try (PreparedStatement pstm = con.prepareStatement(sql)) {
			pstm.setDate(1, java.sql.Date.valueOf(reserva.getDataEntrada()));
			pstm.setDate(2, java.sql.Date.valueOf(reserva.getDataSaida()));
			pstm.setDouble(3, reserva.getValorTotalReserva());
			pstm.setString(4, reserva.getFormaDePagamento());
			pstm.setLong(5, reserva.getIdCliente());

			pstm.execute();

			System.out.println("informações da reserva cadastradas!");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
