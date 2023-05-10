package loja_virtual.modulo07.aula04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import loja_virtual.modulo07.aula04.factory.ConnectionFactory;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.recuperarConexao();

		PreparedStatement stm = con.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");

		stm.setInt(1, 70);

		stm.execute();

		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println(linhasModificadas + " rows changed");

	}

}
