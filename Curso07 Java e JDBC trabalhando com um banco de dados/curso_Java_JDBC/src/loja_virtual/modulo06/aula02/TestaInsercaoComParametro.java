package loja_virtual.modulo06.aula02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		try (Connection con = connectionFactory.recuperarConexao()) {

			con.setAutoCommit(false);

			try (PreparedStatement stm = con.prepareStatement("INSERT INTO PRODUTO (NOME,DESCRICAO) VALUES (?,?)",
					Statement.RETURN_GENERATED_KEYS);) {

				adicionarVariavel("SmarTV", "45 polegadas", stm);
//				adicionarVariavel("Radio", "Radio de bateria", stm);
				adicionarVariavel("Radio2", "Radio de bateria", stm);

				con.commit();

//			stm.close();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Rollback executado! Nada foi salvo!");
				con.rollback();

			}
//		con.close();
		}

	}

	private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);

		stm.execute();

		// Forçando uma exception
		if (nome.equals("Radio")) {
			throw new RuntimeException("Não foi possível adicionar o produto");
		}

		try (ResultSet rst = stm.getGeneratedKeys()) {
			while (rst.next()) {
				Integer id = rst.getInt(1);
				System.out.println("O ID criado foi " + id);
			}
//			rst.close();
		}
	}

}
