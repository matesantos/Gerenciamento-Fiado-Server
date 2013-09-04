package br.ufpb.lp3.gerenciamento_fiado.models;

import java.io.Serializable;

public abstract class Pessoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Long id;
	protected String nome;
	protected String telefone;
	protected String rg;
	protected String cpf;
	protected Endereco endereco;

	public Pessoa(Long id, String nome, String telefone, String rg, String cpf, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public Pessoa(String nome, String telefone, String rg, String cpf, Endereco endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
//	public Pessoa(Parcel in) {
//		readFromParcel(in);
//    }
	
	public Pessoa(){}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
//	public abstract void readFromParcel(Parcel in);

}
