package loja_virtual.modulo08.factory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = connectionFactory.recuperarConexao();

		System.out.println("Conectado ao Banco de Dados");

		con.close();

		System.out.println("\nConexão com o Banco de Dados encerrada");

	}

}
