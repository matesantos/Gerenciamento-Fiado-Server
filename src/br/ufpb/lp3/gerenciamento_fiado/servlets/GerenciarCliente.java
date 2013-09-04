package br.ufpb.lp3.gerenciamento_fiado.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import br.ufpb.lp3.gerenciamento_fiado.DAO.ClienteInterfaceDAO;
import br.ufpb.lp3.gerenciamento_fiado.DAO.ModelFactory;
import br.ufpb.lp3.gerenciamento_fiado.models.Cliente;
import br.ufpb.lp3.gerenciamento_fiado.models.Endereco;

/**
 * Servlet implementation class GerenciarCliente
 */
@WebServlet("/GerenciarCliente")
public class GerenciarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GerenciarCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String dadosCliente = request.getParameter("cliente");
	      
		 try {
			 
	            JSONObject clienteValues = new JSONObject(dadosCliente);
	            int opcao = new Integer(clienteValues.getString("operacao")); 
			 	
			 	switch (opcao) {
				    case 1:
			            
			            String nome = clienteValues.getString("nome");
			            String telefone = clienteValues.getString("telefone");
			            String rg = clienteValues.getString("rg");
			            String cpf = clienteValues.getString("cpf");
			            String rua = clienteValues.getString("rua");
			            String numero = clienteValues.getString("numero");
			            String cep = clienteValues.getString("cep");
			            String estado = clienteValues.getString("uf");
			            String cidade = clienteValues.getString("cidade");
			            String bairro = clienteValues.getString("bairro");

			            PrintWriter out = response.getWriter();
				    	if(cadastrarCliente( nome, telefone, rg, cpf, rua, numero, cep, estado, cidade, bairro)){
				            out.println(new JSONObject("{resposta:true}"));
				    	}else{
				    		out.println(new JSONObject("{resposta:false}"));
				    	}

					break;
					
				    case 2:
				    	
				    break;	
				    
				    case 3:
				    	
					break;
				
				   

				default:
					break;
				}
	            
	        } catch(JSONException jso){
	        	jso.printStackTrace();
	        } catch (Exception e) {
	        	// NullPointerException and JSONException
	            // Use default values assigned before the try block
	        	e.printStackTrace();
	        }		
		 }

	private boolean cadastrarCliente( String nome, String telefone,
			String rg, String cpf, String rua, String numero, String cep,
			String estado, String cidade, String bairro) {
		
		Endereco end = new Endereco(rua, numero, cep, bairro, cidade, estado);
        
        Cliente cliente = new Cliente(nome, telefone, rg, cpf, end);
        
        ClienteInterfaceDAO cli = ModelFactory.getRepositorioCliente();
        
        if(cli.salvarCliente(cliente)){
            System.out.println("cadastrou!");
            return true;
        }
		return false;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
