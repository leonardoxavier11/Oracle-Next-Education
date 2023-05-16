package br.com.alura.loja.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Pedido;
import br.com.alura.loja.vo.RelatorioDeVendasVo;

public class PedidoDao {

	private EntityManager em;

	public PedidoDao(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(Pedido pedido) {
		this.em.persist(pedido);
	}

	public Pedido consultaPorId(Long id) {
		return em.find(Pedido.class, id);
//		String jpql = "SELECT pe FROM Pedido pe WHERE pe.id = :id";
//		return em.createQuery(jpql, Pedido.class).setParameter("id", id).getSingleResult();
	}

	public Pedido buscarPedidoComClientePor(Long id) {
		String jpql = "SELECT pe FROM Pedido pe JOIN FETCH pe.cliente c WHERE pe.id = :id";
		return em.createQuery(jpql, Pedido.class).setParameter("id", id).getSingleResult();
	}

	public List<Pedido> consultaTodos() {
		String jpql = "SELECT pe FROM Pedido pe";
		return em.createQuery(jpql, Pedido.class).getResultList();
	}

	public BigDecimal valorTotalVendido() {
		String jpql = "SELECT SUM(p.valorTotal) FROM Pedido p";
		return em.createQuery(jpql, BigDecimal.class).getSingleResult();
	}

//O relatório tem 3 colunas, cada uma com informações de entidades diferentes

	public List<RelatorioDeVendasVo> relatorioDeVendas() {
		String jpql = "SELECT new br.com.alura.loja.vo.RelatorioDeVendasVo (" + "produto.nome, "
				+ "SUM(item.quantidade), " + "MAX(pedido.data)) "
				// Separado para melhor entendimento

				+ "FROM Pedido pedido " // Pedido -> pedido (isso se chama alias)
				+ "JOIN pedido.itens item " // (pedido.itens) -> item (isso se chama alias)
				+ "JOIN item.produto produto "// (item.produto) -> produto (isso se chama alias)

				// Separado para melhor entendimento
				+ "GROUP BY produto.nome, item.quantidade  " + "ORDER BY item.quantidade DESC";

		return em.createQuery(jpql, RelatorioDeVendasVo.class).getResultList();

	}

}
