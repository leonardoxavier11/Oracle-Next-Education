package loja_virtual.modulo03.aula02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = connectionFactory.recuperarConexao();

		System.out.println("Conectado ao Banco de Dados");

		Statement stm = con.createStatement();
		stm.execute("INSERT INTO PRODUTO (NOME,DESCRICAO) VALUES ('MOUSE','DELL')", Statement.RETURN_GENERATED_KEYS); //Como não é um "select", retorna "false". 
//																										E precisa de um retorno especifico para criar um objeto ResultSet, usando o método algum méoto .getXxxxx
		
		ResultSet rst = stm.getGeneratedKeys();

		while (rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O ID criado foi " + id);
		}

		con.close();

		System.out.println("\nConexão com o Banco de Dados encerrada");

	}

}
