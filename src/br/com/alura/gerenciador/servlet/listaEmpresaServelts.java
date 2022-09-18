package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresaServelts
 */
@WebServlet("/listaEmpresas")
public class listaEmpresaServelts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/***
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/* ACESSAR O BANCO DE DADOS **/
		Banco banco = new Banco();

		/** RECUPERAR A LISTA DAS EMPRESAS JÁ CADSTRADAS NO BANCO */
		List<Empresa> lista = banco.getEmpresa();

		/** DEVOLVER A LISTA PARA O HTML **/
		PrintWriter out = response.getWriter();

		/** MONTA O HMTL **/
		out.println("<html>");
		out.println("<body>");
		/** ELEMENTO HTML QUE REPRESENTA A LISTA **/
		out.println("<ul>");

		/** CRIA O LAÇO FOR PARA RECUPERAR OS ITENS A LISTA **/
		for (Empresa empresa : lista) {
			out.println("<li>" + empresa.getNome());
		}

		out.println("<ul>");
		out.println("</body>");
		out.println("</html>");

		/* imprime uma resposta de sucesso no console */
		System.out.println("A LISTAGEM DA EMPRESA COM SUCESSO!");
	}
}
