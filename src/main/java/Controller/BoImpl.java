package Controller;

import Modell.DAO;
import Modell.Usuario;
import Modell.UsuarioDAO;

public class BoImpl implements BO<Usuario> {

	@Override
	public void Salvar(Usuario usuario) {
		if(Validar(usuario)){
		if(usuario.getId()!=null){
			
			try {
				DAO<Usuario> alterar=new UsuarioDAO();
				alterar.Alterar(usuario);
				
			}finally{
				
			}
			
			
		
		}else{
			try {
				DAO<Usuario> incluir = new UsuarioDAO();
				incluir.Incluir(usuario);
			}finally{
				
			}
			
		}
		}else{
			System.out.println("Usuario invalido");
		}
		
	}

	@Override
	public boolean Validar(Usuario usuario) {
		boolean sucesso=true;
		
		if("".equals(usuario.getNome())){
			sucesso=false;
		}
		
		if("".equals(usuario.getLogin())){
			sucesso=false;
		}
		if("".equals(usuario.getSenha())){
			sucesso=false;
			
		}
		
		return sucesso;
	}

}
