package br.com.alura.loja.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "valor_total")
//	Por padrão o Java sabe que model camelCase é equivalente à valor_total no Banco de Dados apenas para atributos de relacionamento

	private BigDecimal valorTotal;
	private LocalDate dataPedido = LocalDate.now();

	@ManyToOne
	private Cliente cliente; // Todo pedido tem um ou muitos clientes. Nesse caso é @ManyToOne = tem um.

	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
//	mappedBy = Se faz necessário toda vez que há um relacionamento bidimencional
// cascade = 

	private List<ItemPedido> itens = new ArrayList<>();
//	Precisamos criar uma nova entidade chamada "itens_pedido", pois não podemos fazer uma relação ManyToMany simples, entre "pedido" e "cliente". Precisamos fazer um join entre essas tabelas, porém também precisamos acrescentar outros atributos à ela

	public Pedido() {
	}

	public Pedido(Cliente cliente) {
		this.cliente = cliente;
	}

	public void adicionarItem(ItemPedido item) {
		item.setPedido(this); // <-- Entender melhor! -> Se faz necessário toda vez que há um relacionamento
								// bidimencional
		this.itens.add(item);
	}

	public Long getId() {
		return id;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
