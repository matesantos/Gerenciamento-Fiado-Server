package br.ufpb.lp3.gerenciamento_fiado.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.ufpb.lp3.gerenciamento_fiado.models.Produto;


public class ProdutoDAO implements ProdutoInterfaceDAO{

	private static final Map<Long, Produto> map = new HashMap<Long, Produto>();
	private static long nextId = 0;

	static{
		ProdutoDAO produtoDao = new ProdutoDAO();
	}
	
	@Override
	public boolean salvarProduto(Produto produto) {
		System.out.println("Tamanho da lista do produto antes: " + map.size());

		if (produto.getPreco() == null) {
			// Se é um novo vendedor, incrementa um novo id
			produto.setCodigo(++nextId);
		}
		// Atualiza o vendedor, ou insere um novo com o próximo id
		map.put(produto.getCodigo(), produto);
		
		System.out.println("Tamanho da lista do produto depois: " + map.size());
		return true;
	}

	@Override
	public boolean deletarProduto(Produto produto) {
		map.remove(produto);
		return true;
	}

	@Override
	public List<Produto> listarProduto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto getProduto(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto buscarProdutoPorNome(
			String nome) {
		// TODO Auto-generated method stub
		return null;
	}


}
