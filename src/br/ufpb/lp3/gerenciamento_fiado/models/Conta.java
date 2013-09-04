package br.ufpb.lp3.gerenciamento_fiado.models;

import java.util.ArrayList;
import java.util.Calendar;

public class Conta {

	private ArrayList<Produto> prudutosComprados;
	private Calendar dataCompra;
	private Float valorCompra;
	public Conta(ArrayList<Produto> prudutosComprados, Calendar dataCompra,
			Float valorCompra) {
		super();
		this.prudutosComprados = prudutosComprados;
		this.dataCompra = dataCompra;
		this.valorCompra = valorCompra;
	}
	public ArrayList<Produto> getPrudutosComprados() {
		return prudutosComprados;
	}
	public void setPrudutosComprados(ArrayList<Produto> prudutosComprados) {
		this.prudutosComprados = prudutosComprados;
	}
	public Calendar getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(Calendar dataCompra) {
		this.dataCompra = dataCompra;
	}
	public Float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(Float valorCompra) {
		this.valorCompra = valorCompra;
	}
	
}
