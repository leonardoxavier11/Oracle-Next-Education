package br.com.alura.loja.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Produto;

public class ProdutoDao {

	private EntityManager em;

	public ProdutoDao(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(Produto produto) {
		this.em.persist(produto);
	}

	public Produto buscarPorId(Long id) {
		return em.find(Produto.class, id);
	}

	public List<Produto> buscarTodo() {
//		String jpql = "SELECT * FROM produtos"; // -> Se fosse SQL, seria assim
		String jpql = "SELECT p FROM Produto p"; // -> O JPQL deve ser construido com com referências as classes dos
													// objetos
		return em.createQuery(jpql, Produto.class).getResultList();
	}
}
