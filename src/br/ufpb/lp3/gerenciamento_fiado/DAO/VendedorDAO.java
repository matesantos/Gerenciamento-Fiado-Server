package br.ufpb.lp3.gerenciamento_fiado.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.ufpb.lp3.gerenciamento_fiado.models.Vendedor;

public class VendedorDAO implements VendedorInterfaceDAO {

	private static final Map<Long, Vendedor> map = new HashMap<Long, Vendedor>();
	private static long nextId = 0;

	static {
		VendedorDAO vendedorBanco = new VendedorDAO();
		vendedorBanco.salvarVendedor(new Vendedor(1l, "Mateus", "3232-0087", "123456", "123456789-12", null,"",""));
	}

	@Override
	public boolean salvarVendedor(Vendedor vendedor) {
		System.out.println("Tamanho da lista do Vendedor antes: " + map.size());
		if (vendedor.getId() == null) {
			// Se é um novo vendedor, incrementa um novo id
			vendedor.setId(++nextId);
		}
		// Atualiza o vendedor, ou insere um novo com o próximo id
		map.put(vendedor.getId(), vendedor);
		
		System.out.println("Tamanho da lista do Vendedor depois: " + map.size());
		return true;
	}

	@Override
	public boolean DeletarVendedor(Vendedor vendedor) {
		map.remove(vendedor).getId();
		return false;
	}

	@Override
	public Vendedor getVendedor(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vendedor> listarVendedores() {
		Collection<Vendedor> vendedor = map.values();
		List<Vendedor> lista = new ArrayList<Vendedor>(vendedor);
		return lista;
	}

	@Override
	public Vendedor buscarVendedorPorNome(String nome) {
		List<Vendedor> vendedores = listarVendedores();
		for (Vendedor vendedor : vendedores) {
			if (vendedor.getNome().equals(nome)) {
				return vendedor;
			}
		}
		return null;
	}
}
