package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*Utilizar a anotação @WebServlet para Definir o nome do Servlet do Request*/
@WebServlet(urlPatterns="/oi")
public class primeiroServlet extends HttpServlet {
	
	/*Utilizar a metodo void que não retorna nada no metodo, e sim, 
	 * no fluxo de reposta do navegador, através da requisição
	 * que irá receber os parametros HttpServletRequest e do HttpServletResponse*/
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		/*Devolver um conteudo HTML no response 
		  Leitura direta(PrintWriter e getWriter*/
		PrintWriter out = resp.getWriter(); 
		out.println("<html>");
		out.println("<body>");
		out.println("Oi mundo, parabens você escreveu seu primeiro servlets");
		out.println("</body>");
		out.println("</html>");
		/*imprime uma resposta de sucesso no console*/
		System.out.println("O servlet OI MUNDO foi chamado com SUCESSO!");
	}
}
