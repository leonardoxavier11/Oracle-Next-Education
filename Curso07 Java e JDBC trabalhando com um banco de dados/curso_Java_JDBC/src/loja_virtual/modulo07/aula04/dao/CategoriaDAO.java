package loja_virtual.modulo07.aula04.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import loja_virtual.modulo07.aula04.modelo.Categoria;

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

}
