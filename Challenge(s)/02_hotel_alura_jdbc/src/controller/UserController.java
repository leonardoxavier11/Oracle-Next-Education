package controller;

import java.sql.Connection;
import java.sql.SQLException;

import dao.UserDao;
import factory.ConnectionFactory;
import modelo.User;

public class UserController {

	private UserDao userDao;

	public UserController() throws SQLException {
		Connection con = new ConnectionFactory().recuperarConexao();
		this.userDao = new UserDao(con);
	}

	public void persistir(User user) throws SQLException {
		this.userDao.persistir(user);
	}

	public boolean verificarSeJaExiste(String user) {
		return this.userDao.verificarSeJaExiste(user);
	}

	public boolean checkPasswordCorrect(String username, String password) throws SQLException {
		return this.userDao.checkPasswordCorrect(username, password);
	}

	public long retornarId(String usuario) {
		return this.userDao.retornarId(usuario);
	}

}
