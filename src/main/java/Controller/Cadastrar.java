package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modell.Usuario;

@WebServlet(urlPatterns="/cadastrar")
public class Cadastrar extends HttpServlet {

public void Cadastrar(){
	System.out.println("Cadastrado");
}
@Override
	public void init() throws ServletException {
	System.out.println("Cadastrado");
		super.init();
	}

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
	throws ServletException, IOException {
	Usuario usuario=new Usuario();
	
	String nome=req.getParameter("nome");
	String login=req.getParameter("login");
	String senha=req.getParameter("senha");
	
	usuario.setNome(nome);
	usuario.setLogin(login);
	usuario.setSenha(senha);
	
	System.out.println(usuario.getLogin());
	BO<Usuario> salvar=new BoImpl();
	//INSERINDO USUARIO
	salvar.Salvar(usuario);
}	

@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
}
