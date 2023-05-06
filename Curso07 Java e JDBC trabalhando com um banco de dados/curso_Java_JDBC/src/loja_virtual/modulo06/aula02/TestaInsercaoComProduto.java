package loja_virtual.modulo06.aula02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import loja_virtual.modulo06.aula02.modelo.Produto;

public class TestaInsercaoComProduto {

	public static void main(String[] args) throws SQLException {

		Produto produto = new Produto("janela", "janela de aluminio");

		try (Connection con = new ConnectionFactory().recuperarConexao()) {

			String sql = "INSERT INTO PRODUTO (NOME, DESCRICAO) VALUES (?, ?)";

			try (PreparedStatement pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

				pstm.setString(1, produto.getNome());
				pstm.setString(2, produto.getDescricao());

				pstm.execute();

				try (ResultSet rst = pstm.getGeneratedKeys()) {
					while (rst.next()) {
						produto.setId(rst.getInt(1));
					}
				}
			}

		}

		System.out.println(produto);

	}
}
