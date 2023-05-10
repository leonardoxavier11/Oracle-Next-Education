package loja_virtual.modulo01.aula06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "Murilo12@34");

		System.out.println("Conectado ao Banco de Dados");

		con.close();

		System.out.println("\nConexão com o Banco de Dados encerrada");
	}

}
