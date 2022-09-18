package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class NovaEmpresa
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("CADASTRAR DA NOVA EMPRESA");
		
		//receber o parametro pela requisição
		String nomeEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa(); 
		//recebe a string vinda do request
		empresa.setNome(nomeEmpresa);
		
		//acessar o banco de dados
		Banco banco = new Banco();
		banco.adicionar(empresa); 
		
		PrintWriter out = response.getWriter(); 
		out.println("<html><body>Empresa "+ nomeEmpresa +" Cadastrada com sucesso!</body></html>");
	}}
