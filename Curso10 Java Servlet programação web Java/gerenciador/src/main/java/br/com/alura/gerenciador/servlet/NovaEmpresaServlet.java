package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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

		String nomeEmpresa = request.getParameter("nome"); // Recebendo parametros a partir da url do navegador (após
															// "?")

		PrintWriter out = response.getWriter();
		out.println("<html><boby>Cadastrando " + nomeEmpresa + "  com sucesso</boby></html>");
	}

}
