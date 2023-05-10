package loja_virtual.modulo07.aula07.modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private Integer id;
	private String nome;
	private List<Produto> produtos = new ArrayList<Produto>(); // Uma Categoria tem vários Produtos

	public Categoria() {
	}

	public Categoria(String nome) {
		this.nome = nome;
	}

	public Categoria(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return String.format("%d - %s", this.id, this.nome);
	}

	public String getNome() {
		return nome;
	}

	public Integer getId() {
		return id;
	}

	public void adicionar(Produto produto) {
		this.produtos.add(produto);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

}
