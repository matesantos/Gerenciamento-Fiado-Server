package br.ufpb.lp3.gerenciamento_fiado.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.ufpb.lp3.gerenciamento_fiado.models.Cliente;


public class ClienteDAO implements ClienteInterfaceDAO{

	private static final Map<Long, Cliente> map = new HashMap<Long, Cliente>();
	private static long nextId = 0;

	static {
		ClienteDAO clienteBanco = new ClienteDAO();
		clienteBanco.salvarCliente(new Cliente(1l, "Mateus", "3232-0087", "123456", "123456789-12", null));
	}

	@Override
	public boolean salvarCliente(Cliente cliente) {
		System.out.println("Tamanho da lista do Cliente antes: " + map.size());
		if (cliente.getId() == null) {
			// Se é um novo vendedor, incrementa um novo id
			cliente.setId(++nextId);
		}
		// Atualiza o carro, ou insere um novo com o próximo id
		map.put(cliente.getId(), cliente);
		System.out.println("Tamanho da lista do Cliente depois: " + map.size());
		return true;
	}

	@Override
	public boolean DeletarCliente(Cliente cliente) {
		map.remove(cliente).getId();
		return false;
	}

	@Override
	public Cliente getCliente(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> listarCliente() {
		Collection<Cliente> vendedor = map.values();
		List<Cliente> lista = new ArrayList<Cliente>(vendedor);
		return lista;
	}

	@Override
	public Cliente buscarClientePorNome(String nome) {
		List<Cliente> vendedores = listarCliente();
		for (Cliente vendedor : vendedores) {
			if (vendedor.getNome().equals(nome)) {
				return vendedor;
			}
		}
		return null;
	}
}
