package loja_virtual.modulo08;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import loja_virtual.modulo08.dao.ProdutoDAO;
import loja_virtual.modulo08.factory.ConnectionFactory;
import loja_virtual.modulo08.modelo.Produto;

public class TestaInsercaoEListaComProduto {

	public static void main(String[] args) throws SQLException {

		Produto produto = new Produto("NOTEBOOK", "SAMSUNG");
		Produto produto2 = new Produto("GELADEIRA", "AZUL");
		Produto produto3 = new Produto("COMODA", "VERTICAL");

		try (Connection con = new ConnectionFactory().recuperarConexao()) {
			ProdutoDAO produtoDao = new ProdutoDAO(con);
			produtoDao.salvar(produto);
			produtoDao.salvar(produto2);
			produtoDao.salvar(produto3);
		}

		try (Connection con = new ConnectionFactory().recuperarConexao()) {
			ProdutoDAO produtoDao = new ProdutoDAO(con);
			List<Produto> listagemDeProdutos = produtoDao.listar();
//			for (Produto produtos : listagemDeProdutos) {
//				System.out.println(produtos);
//			}
			listagemDeProdutos.forEach(System.out::println); // Preferi essa forma pq não estou filtrando nada.
//			listagemDeProdutos.stream().forEach(lp -> System.out.println(lp));

		}

	}
}
