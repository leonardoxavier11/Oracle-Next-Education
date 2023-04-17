package br.com.alura;

import java.util.Set;
import java.util.TreeSet;

public class Empresa {

//	private Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorNome());
	private Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());

	public void contrata(Funcionario f) {
		this.funcionarios.add(f);
	}

	public Set<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	@Override
	public String toString() {
		return "Empresa [funcionarios=" + funcionarios + "]";
	}

}
