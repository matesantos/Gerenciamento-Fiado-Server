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

import br.ufpb.lp3.gerenciamento_fiado.DAO.ModelFactory;
import br.ufpb.lp3.gerenciamento_fiado.DAO.VendedorInterfaceDAO;
import br.ufpb.lp3.gerenciamento_fiado.models.Endereco;
import br.ufpb.lp3.gerenciamento_fiado.models.Vendedor;

/**
 * Servlet implementation class GerenciarVendedor
 */
@WebServlet("/GerenciarVendedor")
public class GerenciarVendedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GerenciarVendedor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String dadosVendedor = request.getParameter("vendedor");
	      
		 try {
			 
	            JSONObject vendedorValues = new JSONObject(dadosVendedor);
	            int opcao = new Integer(vendedorValues.getString("operacao")); 
			 	
			 	switch (opcao) {
				    case 1:
			            
			            String nome = vendedorValues.getString("nome");
			            String telefone = vendedorValues.getString("telefone");
			            String rg = vendedorValues.getString("rg");
			            String cpf = vendedorValues.getString("cpf");
			            String rua = vendedorValues.getString("rua");
			            String numero = vendedorValues.getString("numero");
			            String cep = vendedorValues.getString("cep");
			            String estado = vendedorValues.getString("uf");
			            String cidade = vendedorValues.getString("cidade");
			            String bairro = vendedorValues.getString("bairro");
			            String login = vendedorValues.getString("login");
			            String senha = vendedorValues.getString("senha");
			            
			            PrintWriter out = response.getWriter();
				    	if(cadastrarVendedor(nome,telefone,rg,cpf,rua,numero,cep,estado,cidade,bairro,login,senha)){
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

	private boolean cadastrarVendedor(String nome, String telefone, String rg, String cpf,	String rua,String numero, 
								   String cep, String estado, String cidade,String bairro,String login, String senha) {
		
		Endereco end = new Endereco(rua, numero, cep, bairro, cidade, estado);
        
        Vendedor vendedor = new Vendedor(nome, telefone, rg, cpf, end, login, senha);
        
        VendedorInterfaceDAO vend = ModelFactory.getRepositorioVendedor();
        
        if(vend.salvarVendedor(vendedor)){
            System.out.println("cadastrou!");
            return true;
        }
		return false;
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		doGet(request, response);
	}

}
