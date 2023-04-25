package com.loiane.cursojava.aula25;

public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	double preco;
	boolean ligada;

	void ligar() {
		this.ligada = true;
	}

	void desligar() {
		this.ligada = false;
	}

	void status() {
		if (this.ligada) {
			System.out.println("A lampada está ligada " + this.ligada);
		} else {
			System.out.println("A lampada está desligada " + this.ligada);
		}
	}
}
