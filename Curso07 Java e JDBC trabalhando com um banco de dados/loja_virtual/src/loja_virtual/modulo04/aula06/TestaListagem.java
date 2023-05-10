package loja_virtual.modulo04.aula06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = connectionFactory.recuperarConexao();

		System.out.println("Conectado ao Banco de Dados");

		PreparedStatement stm = con.prepareStatement("SELECT * FROM PRODUTO");
//		PreparedStatement stm = con.prepareStatement("SELECT * FROM PRODUTO WHERE ?");

		stm.execute();

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
