package br.ufpb.lp3.gerenciamento_fiado.DAO;

public class ModelFactory {

	private static VendedorDAO vendedor;
	private static ClienteDAO cliente;
	private static ProdutoDAO produto;
	

	public static VendedorDAO getRepositorioVendedor() {
		if (vendedor == null) {
			vendedor = new VendedorDAO();
		}
		return vendedor;
	}
	
	public static ClienteDAO getRepositorioCliente() {
		if (cliente == null) {
			cliente = new ClienteDAO();
		}
		return cliente;
	}
	
	public static ProdutoDAO getRepositorioProduto() {
		if (produto == null) {
			produto = new ProdutoDAO();
		}
		return produto;
	}

}
