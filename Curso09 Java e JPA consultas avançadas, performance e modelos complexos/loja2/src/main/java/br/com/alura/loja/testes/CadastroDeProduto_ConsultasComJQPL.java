package br.com.alura.loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

public class CadastroDeProduto_ConsultasComJQPL {

	public static void main(String[] args) {
		cadastrarCategoriaEProduto();

		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);

		Produto p = produtoDao.buscarPorId(1l);
//		System.out.println(p.getPreco());

		List<Produto> todos = produtoDao.buscarTodo();
		todos.forEach(p2 -> System.out.println(p2.getNome()));

	}

	private static void cadastrarCategoriaEProduto() {
		Categoria celulares = new Categoria("CELULARES");
		Produto celular = new Produto("Xiaomi", "Celular Chines", new BigDecimal("800"), celulares);
		Produto celular2 = new Produto("Samsung", "Celular Coreano", new BigDecimal("1200"), celulares);

		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);

		em.getTransaction().begin();

		categoriaDao.cadastrar(celulares);
		produtoDao.cadastrar(celular);
		produtoDao.cadastrar(celular2);

		em.getTransaction().commit();
		em.close();

	}

}
