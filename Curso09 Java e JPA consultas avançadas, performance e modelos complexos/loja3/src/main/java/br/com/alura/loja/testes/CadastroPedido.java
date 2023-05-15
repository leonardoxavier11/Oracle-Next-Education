package br.com.alura.loja.testes;

import java.math.BigDecimal;

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

public class CadastroPedido {

	public static void main(String[] args) {
		popularBancoDeDados();

		cadastrarPedido();

	}

// Método simulando o input de informações de um usuário, com o objetivo de popular nosso Banco de Dados
	public static void popularBancoDeDados() {

// Partindo do principio que nosso banco de dados não tem nenhuma informação
// Vamos cadastrar os produtos que ficarão no "estoque", porém antes também precisamos definir as categorias de separação
		Categoria celulares = new Categoria("CELULARES");
		Categoria Eletronicos = new Categoria("ELETRONICOS");
		Categoria Eletrodomesticos = new Categoria("ELETRODOMESTICOS");

		Produto celular = new Produto("Xiomi", "Moderno", new BigDecimal("800"), celulares);
		Produto geladeira = new Produto("Brastemp", "Preta", new BigDecimal("1000"), Eletrodomesticos);

//Instacio o Cliente que fará um Pedido de fato
		Cliente cliente = new Cliente("Leonardo", "146950");

//Crio a variável "em" com as informações do Banco de Dados que já estão informadas na class JPAUtil (url, user, passw)
		EntityManager em = JPAUtil.getEntityManager();

//Instancio os DAO que serão os responsáveis por enviar (persistir) os objetos criados a partir das class Modelos para o Banco de Dados
		CategoriaDao categoriaDao = new CategoriaDao(em);
		ProdutoDao produtoDao = new ProdutoDao(em);
		ClienteDao clienteDao = new ClienteDao(em);

//Utilizo os comandos da interface EntityManager para iniciar a conexão com o Banco de Dados, fazer o commit e fechar a conexão. 
		em.getTransaction().begin(); // Conexão com o BD

		categoriaDao.cadastrar(celulares);
		categoriaDao.cadastrar(Eletrodomesticos);
		categoriaDao.cadastrar(Eletronicos);

		produtoDao.cadastrar(celular);
		produtoDao.cadastrar(geladeira);

		clienteDao.cadastrar(cliente);

		em.getTransaction().commit(); // Até então, as informações estavam apenas em estado "MANAGED" -> em.persist()

		em.close(); // Fechando conexão com o BD
	}

// Método simulando o input de informações de um usuário, com o objetivo de realizar um pedido de um cliente, a partir dos produtos que estão no  nosso Banco de Dados
	public static void cadastrarPedido() {

// Crio a variável "em" com as informações do Banco de Dados que já estão informadas na class JPAUtil (url, user, passw)
		EntityManager em = JPAUtil.getEntityManager();

//Instancio o ClienteDao, para recuperar as informações do Banco de Dados
		ClienteDao clienteDao = new ClienteDao(em);

//Recupero as informações do Cliente que estão no Banco de Dados e gravo na variável "cliente"
		Cliente cliente = clienteDao.buscarPorId(1l);

//Instancio o Pedido vinculado à variável "cliente", que foi recuperada do Banco de Dados
		Pedido pedido = new Pedido(cliente);

//Instancio os outros DAO que serão os responsáveis por enviar (persistir) os objetos criados a partir das class Modelos para o Banco de Dados
		ProdutoDao produtoDao = new ProdutoDao(em);
		PedidoDao pedidoDao = new PedidoDao(em);

//Utilizado o método de "buscarPoId" para recuperar um produto que já está no Banco de Dados
		Produto produto = produtoDao.buscarPorId(1l);
		Produto produto2 = produtoDao.buscarPorId(2l);

//Adicionar itens ao pedido do cliente
		pedido.adicionarItem(new ItemPedido(10, pedido, produto));
		pedido.adicionarItem(new ItemPedido(10, pedido, produto2));

//Utilizo os comandos da interface EntityManager para iniciar a conexão com o Banco de Dados, fazer o commit e fechar a conexão. 
		em.getTransaction().begin();

		pedidoDao.cadastrar(pedido); // Utilizo o método "cadastrar" do PedidoDao para persistir no Banco de Dados

		em.getTransaction().commit();
	}
}
