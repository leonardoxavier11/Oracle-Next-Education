package loja_virtual.modulo06.aula02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.recuperarConexao();

		PreparedStatement stm = con.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");

		stm.setInt(1, 12);

		stm.execute();

		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println(linhasModificadas + " rows changed");

	}

}
