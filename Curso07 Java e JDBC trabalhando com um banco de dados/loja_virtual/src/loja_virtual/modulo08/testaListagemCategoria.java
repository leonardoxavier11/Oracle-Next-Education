package loja_virtual.modulo08;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import loja_virtual.modulo08.dao.CategoriaDAO;
import loja_virtual.modulo08.factory.ConnectionFactory;
import loja_virtual.modulo08.modelo.Categoria;
import loja_virtual.modulo08.modelo.Produto;

public class testaListagemCategoria {

	public static void main(String[] args) throws SQLException {
		try (Connection con = new ConnectionFactory().recuperarConexao()) {
			CategoriaDAO categoriaDAO = new CategoriaDAO(con);
			List<Categoria> listagemCategorias = categoriaDAO.listarComProdutos();

			listagemCategorias.stream().forEach(ct -> {
				System.out.println("Categoria: " + ct.getNome());
				for (Produto produto : ct.getProdutos()) {
					System.out.println("- " + produto.getNome());
				}

			});

		}
	}

}
