package br.ufpb.lp3.gerenciamento_fiado.DAO;

import java.util.List;

import br.ufpb.lp3.gerenciamento_fiado.models.Vendedor;

public interface VendedorInterfaceDAO {

	// public final static int listar = 1;
	// public final static int salvar = 2;
	// public final static int atualizar = 3;
	// public final static int excluir = 4;

	// salva ou atualizar vendedor
	public boolean salvarVendedor(Vendedor vendedor);

	// deletar algum vendedor
	public boolean DeletarVendedor(Vendedor vendedor);

	// Busca i vendedor pelo o id
	public Vendedor getVendedor(Long id);

	// Retorna uma lista com todos os Vendedores
	public List<Vendedor> listarVendedores();

	// Busca o Vendedor pelo nome
	public Vendedor buscarVendedorPorNome(String nome);

}
