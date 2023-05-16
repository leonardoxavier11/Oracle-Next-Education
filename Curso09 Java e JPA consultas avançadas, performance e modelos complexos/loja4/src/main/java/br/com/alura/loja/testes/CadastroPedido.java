package br.com.alura.loja.testes;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ClienteDao;
import br.com.alura.loja.dao.PedidoDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Cliente;
import br.com.alura.loja.modelo.ItemPedido;
import br.com.alura.loja.modelo.Pedido;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;
import br.com.alura.loja.vo.RelatorioDeVendasVo;

public class CadastroPedido {

	public static void main(String[] args) {
		popularBancoDeDados();

		cadastrarPedido();

		EntityManager em = JPAUtil.getEntityManager();
		PedidoDao pedidoDao = new PedidoDao(em);

//		List<Pedido> pedidos = pedidoDao.consultaTodos();
//		pedidos.forEach(p -> System.out.println(
//				p.getId() + "\n" + p.getData() + "\n" + p.getValorTotal() + "\n" + p.getCliente().getId()));
//
//		ProdutoDao produtoDao = new ProdutoDao(em);
//
//		List<Produto> produtosCategoria = produtoDao.buscarPorCategoria("ELETRODOMESTICOS");
//		produtosCategoria.forEach(prd -> System.out.println(prd.getNome()));
//
//		System.out.println(produtoDao.buscarPrecoDoProdutoComNome("Brastemp"));
//
////		produtoDao.deletarTodos();
//
//		List<RelatorioDeVendasVo> relatorio = pedidoDao.relatorioDeVendas();
//		relatorio.forEach(vo -> System.out.println(vo));
////		relatorio.forEach(System.out::println);

//		Pedido consultaPedidoPorId = pedidoDao.buscarPedidoComClientePor(1l);
//		System.out.println(consultaPedidoPorId.getCliente().getNome());

		ProdutoDao produtoDao = new ProdutoDao(em);
		produtoDao.buscarPorParametrosComCriteria("geladeira", null, LocalDate.now());
		produtoDao.buscarPorParametrosComCriteria("geladeira", null, null);

	}

// Método simulando o input de informações de um usuário, com o objetivo de popular nosso Banco de Dados
	public static void popularBancoDeDados() {

		Categoria celulares = new Categoria("CELULARES");
		Categoria Eletronicos = new Categoria("ELETRONICOS");
		Categoria Eletrodomesticos = new Categoria("ELETRODOMESTICOS");

		Produto celular = new Produto("Xiomi", "Moderno", new BigDecimal("800"), celulares);
		Produto geladeira = new Produto("Brastemp", "Preta", new BigDecimal("1000"), Eletrodomesticos);

		Cliente cliente = new Cliente("Leonardo", "146950");

		EntityManager em = JPAUtil.getEntityManager();

		CategoriaDao categoriaDao = new CategoriaDao(em);
		ProdutoDao produtoDao = new ProdutoDao(em);
		ClienteDao clienteDao = new ClienteDao(em);

		em.getTransaction().begin(); // Conexão com o BD

		categoriaDao.cadastrar(celulares);
		categoriaDao.cadastrar(Eletrodomesticos);
		categoriaDao.cadastrar(Eletronicos);

		produtoDao.cadastrar(celular);
		produtoDao.cadastrar(geladeira);

		clienteDao.cadastrar(cliente);

		em.getTransaction().commit();

		em.close();
	}

// Método simulando o input de informações de um usuário, com o objetivo de realizar um pedido de um cliente, a partir dos produtos que estão no  nosso Banco de Dados
	public static void cadastrarPedido() {

		EntityManager em = JPAUtil.getEntityManager();

		ClienteDao clienteDao = new ClienteDao(em);

		Cliente cliente = clienteDao.buscarPorId(1l);

		Pedido pedido = new Pedido(cliente);
		Pedido pedido2 = new Pedido(cliente);

		ProdutoDao produtoDao = new ProdutoDao(em);
		PedidoDao pedidoDao = new PedidoDao(em);

		Produto produto = produtoDao.buscarPorId(1l);
		Produto produto2 = produtoDao.buscarPorId(2l);

		pedido.adicionarItem(new ItemPedido(10, pedido, produto));
		pedido.adicionarItem(new ItemPedido(15, pedido, produto2));

		pedido2.adicionarItem(new ItemPedido(50, pedido2, produto2));

		em.getTransaction().begin();

		pedidoDao.cadastrar(pedido);
		pedidoDao.cadastrar(pedido2);

		em.getTransaction().commit();
	}
}
