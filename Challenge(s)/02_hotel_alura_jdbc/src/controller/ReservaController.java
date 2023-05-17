package controller;

import java.sql.Connection;
import java.sql.SQLException;

import dao.ReservaDao;
import factory.ConnectionFactory;
import modelo.Reserva;

public class ReservaController {

	private ReservaDao hospedeDao;

	public ReservaController() {
		Connection con;
		try {
			con = new ConnectionFactory().recuperarConexao();
			this.hospedeDao = new ReservaDao(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void persistir(Reserva reserva) {
		this.hospedeDao.persistir(reserva);

	}
}
