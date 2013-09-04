package br.ufpb.lp3.gerenciamento_fiado.DAO;

import java.util.List;

import br.ufpb.lp3.gerenciamento_fiado.models.Produto;
import br.ufpb.lp3.gerenciamento_fiado.models.Vendedor;

public interface ProdutoInterfaceDAO {
	
	// public final static int listar = 1;
	// public final static int salvar = 2;
	// public final static int atualizar = 3;
	// public final static int excluir = 4;

	// salva ou atualizar Produto
	public boolean salvarProduto(Produto produto);

	// deletar algum Produto
	public boolean deletarProduto(Produto produto);

	// Busca i Produto pelo o id
	public Produto getProduto(Long id);

	// Retorna uma lista com todos os Produto
	public List<Produto> listarProduto();

	// Busca o Produto pelo nome
	public Produto buscarProdutoPorNome(String nome);


}
