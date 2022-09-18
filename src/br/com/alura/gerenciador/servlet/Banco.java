package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	/*CRiar um atributo privado da classe static para armazenar 
	a lista dos onjetos do tipo empresa */
	private static List<Empresa> lista = new ArrayList<>();

	/*cria um metdodo para adicionar os objetos empresa na lista */
	public void adicionar(Empresa empresa) {
		// TODO Auto-generated method stub
		lista.add(empresa);
	}

	//metodo para devolver a lista das empresa adicionadas
	public List<Empresa> getEmpresa() {
		// TODO Auto-generated method stub]
		return Banco.lista; 
	}
	
}
