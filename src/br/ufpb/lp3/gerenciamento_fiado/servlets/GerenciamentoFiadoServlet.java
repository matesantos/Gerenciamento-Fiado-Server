package br.ufpb.lp3.gerenciamento_fiado.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GerenciamentoFiadoServlet
 */
@WebServlet("/GerenciamentoFiadoServlet")
public class GerenciamentoFiadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GerenciamentoFiadoServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	      try {
	            PrintWriter out = response.getWriter();
	            
	            out.println("<html>");
		            out.println("<body>");
			         out.println("<h1>JsonServlet</h1>");
			         out.println("</body>");
	            out.println("</html>");
	        
	        } catch (Exception e) {
	        	// NullPointerException and JSONException
	            // Use default values assigned before the try block
	        	e.printStackTrace();
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
