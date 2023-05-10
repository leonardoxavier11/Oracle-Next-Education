package loja_virtual.modulo08.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import loja_virtual.modulo08.modelo.Categoria;
import loja_virtual.modulo08.modelo.Produto;

public class ProdutoDAO {

	private Connection con;

	public ProdutoDAO(Connection con) {
		this.con = con;
	}

	public void salvar(Produto produto) throws SQLException {
		

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

	public List<Produto> listar() throws SQLException {
		System.out.println("Executando a query de listarProdutoDAO");
		
		List<Produto> produtos = new ArrayList<Produto>();
		String sql = "SELECT * FROM PRODUTO";

		try (PreparedStatement pstm = con.prepareStatement(sql)) {
			pstm.execute();

			ResultSet rst = pstm.getResultSet();

			while (rst.next()) {
				Integer id = rst.getInt("ID");
				String nome = rst.getString("NOME");
				String descricao = rst.getString("DESCRICAO");

				Produto produto = new Produto(id, nome, descricao);
				produtos.add(produto);
//				Produto produto = new Produto(rst.getInt("ID"), rst.getString("NOME"), rst.getString("DESCRICAO"));
//				produtos.add(produto);

			}
		}
		return produtos;
	}

	public List<Produto> buscar(Categoria ct) throws SQLException {
		System.out.println("Executando a query de buscarProdutoDAO");
		
		List<Produto> produtos = new ArrayList<Produto>();
		String sql = "SELECT * FROM PRODUTO WHERE CATEGORIA_ID = ?";

		try (PreparedStatement pstm = con.prepareStatement(sql)) {
			pstm.setInt(1, ct.getId());
			pstm.execute();

			ResultSet rst = pstm.getResultSet();

			while (rst.next()) {
				Produto produto = new Produto(rst.getInt(1), rst.getString(2), rst.getString(3));
				produtos.add(produto);

			}
		}
		return produtos;
	}
}
