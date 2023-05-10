package loja_virtual.modulo03.aula02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = connectionFactory.recuperarConexao();

		System.out.println("Conectado ao Banco de Dados");

		Statement stm = con.createStatement();
		stm.execute("SELECT * FROM PRODUTO"); //Como é uma list ou set, retorna "true" e não precisa de nenhum outro retorno para cria um objeto ResultSet, usando o método getResultSet()

		ResultSet rst = stm.getResultSet();
		System.out.println(rst);

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
