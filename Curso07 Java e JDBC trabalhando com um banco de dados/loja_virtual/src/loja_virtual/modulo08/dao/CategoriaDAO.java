package loja_virtual.modulo08.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import loja_virtual.modulo08.modelo.Produto;
import loja_virtual.modulo08.modelo.Categoria;

public class CategoriaDAO {

	private Connection con;

	public CategoriaDAO(Connection con) {
		this.con = con;
	}

	public List<Categoria> listar() throws SQLException {
		List<Categoria> categorias = new ArrayList<>();
		String sql = "SELECT * FROM CATEGORIA";

		try (PreparedStatement pstm = con.prepareStatement(sql)) {
			pstm.execute();

			ResultSet rst = pstm.getResultSet();

			while (rst.next()) {
//				Integer id = rst.getInt(1);
//				String nome = rst.getString(2);
//				Produto produto = new Produto(id, nome);

				Categoria categoria = new Categoria(rst.getInt(1), rst.getString(2));
				categorias.add(categoria);
			}

		}
		return categorias;

	}

	public List<Categoria> listarComProdutos() throws SQLException {
		System.out.println("Executando a query de listarCategoriaDAO"); // Com o código atual não tem várias consultas
																		// ao quando, evitando o "Queries N+1"

		Categoria ultima = null; // Lógica

		List<Categoria> categorias = new ArrayList<>();
		String sql = "SELECT * FROM CATEGORIA C INNER JOIN PRODUTO P ON C.ID = P.CATEGORIA_ID";

		try (PreparedStatement pstm = con.prepareStatement(sql)) {
			pstm.execute();

			try (ResultSet rst = pstm.getResultSet()) {
				while (rst.next()) {

					// Lógica
					if (ultima == null || !ultima.getNome().equals(rst.getString(2))) {
						Categoria categoria = new Categoria(rst.getInt(1), rst.getString(2));
						ultima = categoria;
						categorias.add(categoria);
					}
					Produto produto = new Produto(rst.getInt(3), rst.getString(4), rst.getString(5));
					ultima.adicionar(produto);
				}
			}

		}
		return categorias;

	}

}
