package br.com.alura.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

public class CadastroDeProduto_CicloDeVida {

	public static void main(String[] args) {
		Categoria celulares = new Categoria("CELULARES");

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		em.persist(celulares);
		celulares.setNome("XPTO");

		em.flush();
		em.clear(); // similar ao em.close();

		celulares = em.merge(celulares); // O método merge não muda o estado da categoria, ele devolva outra referencia
											// no estado "MANAGED"
		celulares.setNome("1234");
		em.flush();
		em.clear();

		celulares = em.merge(celulares);
//		em.remove(celulares);
		em.flush();

		Produto celular = new Produto("Xiaomi", "Celular Chines", new BigDecimal("800"), celulares);

		em.persist(celular);
		em.flush();

		System.out.println(celular.getPreco());

	}

}
