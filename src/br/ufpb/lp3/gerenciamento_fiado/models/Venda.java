package br.ufpb.lp3.gerenciamento_fiado.models;

import java.util.ArrayList;

public class Venda {

	private int idVenda;
	private Cliente cliente;
	private ArrayList<Produto> listaProdutos;
	private Float vendaTotal;
	
	public Venda(int idVenda, Cliente cliente, ArrayList<Produto> listaProdutos, Float vendaTotal) {
		super();
		this.idVenda = idVenda;
		this.cliente = cliente;
		this.listaProdutos = listaProdutos;
		this.vendaTotal = vendaTotal;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public Float getVendaTotal() {
		return vendaTotal;
	}

	public void setVendaTotal(Float vendaTotal) {
		this.vendaTotal = vendaTotal;
	}
	
	
}
