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
import br.ufpb.lp3.gerenciamento_fiado.DAO.ProdutoInterfaceDAO;
import br.ufpb.lp3.gerenciamento_fiado.models.Produto;

/**
 * Servlet implementation class GerenciarProdutos
 */
@WebServlet("/GerenciarProdutos")
public class GerenciarProdutos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GerenciarProdutos() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			String dadosProdutos = request.getParameter("produto");

		try {

			JSONObject produtoValues = new JSONObject(dadosProdutos);
			int opcao = new Integer(produtoValues.getString("operacao"));

			switch (opcao) {
			case 1:

				String nome = produtoValues.getString("nome");
				Float preco = (float) produtoValues.getDouble("preco");

				PrintWriter out = response.getWriter();
				if (cadastrarProduto(nome, preco)) {
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

		} catch (JSONException jso) {
			jso.printStackTrace();
		} catch (Exception e) {
			// NullPointerException and JSONException
			// Use default values assigned before the try block
			e.printStackTrace();
		}
	}

	private boolean cadastrarProduto(String nome, Float preco) {


		Produto produto = new Produto( nome, preco);

		ProdutoInterfaceDAO pro = ModelFactory.getRepositorioProduto();

		if (pro.salvarProduto(produto)) {
			System.out.println("cadastrou!");
			return true;
		}
		return false;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
