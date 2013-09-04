package br.ufpb.lp3.gerenciamento_fiado.DAO;

import java.util.List;

import br.ufpb.lp3.gerenciamento_fiado.models.Cliente;

public interface ClienteInterfaceDAO {

	// public final static int listar = 1;
	// public final static int salvar = 2;
	// public final static int atualizar = 3;
	// public final static int excluir = 4;

	// salva ou atualizar Cliente
	public boolean salvarCliente(Cliente cliente);

	// deletar algum Cliente
	public boolean DeletarCliente(Cliente cliente);

	// Busca i Cliente pelo o id
	public Cliente getCliente(Long id);

	// Retorna uma lista com todos os Cliente
	public List<Cliente> listarCliente();

	// Busca o Cliente pelo nome
	public Cliente buscarClientePorNome(String nome);

}
