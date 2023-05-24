package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Foi substituido o "service" pelo "doPost"
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Cadastrando nova empresa");

// 		Recebendo parametros a partir da url do navegador (após "?" se for Get ouoculto se for POST)
		String nomeEmpresa = request.getParameter("nome"); // "name=nome" na pag anterior

		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);

		// Simular um banco de dados
		Banco banco = new Banco();
		banco.adiciona(empresa);

//		PrintWriter out = response.getWriter();
//		out.println("<html><body>Empresa " + nomeEmpresa + " cadastrada com sucesso!</body></html>");

		// Chamar o JSP
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		
		//Repassando o atributo na requesição para o JSP
		request.setAttribute("empresa", empresa.getNome());
		rd.forward(request, response);
	}

}
