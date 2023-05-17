package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.User;

public class UserDao {

	Connection con;

	public UserDao(Connection con) {
		this.con = con;
	}

	public void persistir(User user) throws SQLException {
		String sql = "INSERT INTO usuarios (NOME, SENHA) VALUES (?,?)";

		try (PreparedStatement pstm = con.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS)) {
			pstm.setString(1, user.getUsuario());
			pstm.setString(2, user.getSenha());

			pstm.execute();

			System.out.println("Usuário criado e cadastrado no BD!");
		}
	}

	public boolean verificarSeJaExiste(String user) {
		String sql = "SELECT COUNT(*) FROM usuarios WHERE nome = ?";

		try (PreparedStatement pstm = con.prepareStatement(sql)) {
			pstm.setString(1, user);

			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				int count = rs.getInt(1);
				return count > 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	};

	public boolean checkPasswordCorrect(String username, String password) {
		String sql = "SELECT COUNT(*) FROM usuarios WHERE username = ? AND password = ?";

		try (PreparedStatement pstm = con.prepareStatement(sql)) {
			pstm.setString(1, username);
			pstm.setString(2, password);

			try (ResultSet resultSet = pstm.executeQuery()) {
				if (resultSet.next()) {
					int count = resultSet.getInt(1);
					return count > 0;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public Long retornarId(String usuario) {
		String sql = "SELECT id FROM usuarios WHERE nome = ?";
		try (PreparedStatement pstm = con.prepareStatement(sql)) {
			pstm.setString(1, usuario);
			try (ResultSet rs = pstm.executeQuery()) {
				if (rs.next()) {
					Long id = rs.getLong("id");
					System.out.println("O id é " + id);
					return id;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 404L; // ou algum valor de erro, caso a consulta não retorne nenhum resultado
	}

}
