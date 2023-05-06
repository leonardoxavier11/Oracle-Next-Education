package loja_virtual.modulo06.aula03;

import java.sql.Connection;
import java.sql.SQLException;

import loja_virtual.modulo06.aula03.dao.ProdutoDAO;
import loja_virtual.modulo06.aula03.modelo.Produto;

public class TestaInsercaoComProduto {

	public static void main(String[] args) throws SQLException {

		Produto produto = new Produto("janela", "janela de aço");

		try (Connection con = new ConnectionFactory().recuperarConexao()) {
			ProdutoDAO produtoDao = new ProdutoDAO(con);
			produtoDao.salvar(produto);
		}

		System.out.println(produto);

	}
}
