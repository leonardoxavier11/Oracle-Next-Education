package loja_virtual.modulo02.aula01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "Murilo12@34");

		System.out.println("Conectado ao Banco de Dados");

		Statement stm = con.createStatement();
		stm.execute("SELECT * FROM PRODUTO");

		ResultSet rst = stm.getResultSet();

		while (rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println(id);
			String nome = rst.getString("NOME");
			System.out.println(nome);
			String descricao = rst.getString("DESCRICAO");
			System.out.println(descricao);
		}

		con.close();

		System.out.println("\nConexão com o Banco de Dados encerrada");

	}

}
