package br.ufpb.lp3.gerenciamento_fiado.models;

import java.io.Serializable;

public class Produto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long codigo;
	private String nome;
	private Float preco;
	
	public Produto(Long codigo, String nome, Float preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(String nome, Float preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(){}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}
	
	
}
