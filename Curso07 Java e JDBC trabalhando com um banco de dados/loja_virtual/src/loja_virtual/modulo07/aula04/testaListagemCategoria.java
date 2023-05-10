package loja_virtual.modulo07.aula04;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import loja_virtual.modulo07.aula04.dao.CategoriaDAO;
import loja_virtual.modulo07.aula04.modelo.Categoria;

public class testaCategoria {

	public static void main(String[] args) throws SQLException {
		try (Connection con = new ConnectionFactory().recuperarConexao()) {
			CategoriaDAO categoriaDAO = new CategoriaDAO(con);
			List<Categoria> listagemCategorias = categoriaDAO.listar();
			
//			listagemCategorias.forEach(System.out::println);
			listagemCategorias.stream().forEach(a -> System.out.println(a));
		}
	}

}
