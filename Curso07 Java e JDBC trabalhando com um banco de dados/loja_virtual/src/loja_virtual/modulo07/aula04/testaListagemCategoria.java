package loja_virtual.modulo07.aula04;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import loja_virtual.modulo07.aula04.dao.CategoriaDAO;
import loja_virtual.modulo07.aula04.dao.ProdutoDAO;
import loja_virtual.modulo07.aula04.factory.ConnectionFactory;
import loja_virtual.modulo07.aula04.modelo.Categoria;
import loja_virtual.modulo07.aula04.modelo.Produto;

public class testaListagemCategoria {

	public static void main(String[] args) throws SQLException {
		try (Connection con = new ConnectionFactory().recuperarConexao()) {
			CategoriaDAO categoriaDAO = new CategoriaDAO(con);
			List<Categoria> listagemCategorias = categoriaDAO.listar();

			listagemCategorias.stream().forEach(ct -> {
				System.out.println("Categoria: " + ct.getNome());
				try {
					for (Produto produto : new ProdutoDAO(con).buscar(ct)) { // ProdutoDAO = uma lista de produtos. Pois
																				// o método buscar retorna exatamente
																				// isso.
//						System.out.println(ct.getNome() + " - " + produto.getNome());
						System.out.println("- " + produto.getNome());
					}

				} catch (SQLException e) {
					e.printStackTrace();
				}
			});

		}
	}

}
