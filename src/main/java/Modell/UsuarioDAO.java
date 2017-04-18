package Modell;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Conexao.Conexao;

public class UsuarioDAO implements DAO<Usuario>{
	private Connection conn;

	public UsuarioDAO(){
 		conn=new Conexao("org.postgresql.Driver","jdbc:postgresql://localhost:5432/fabricaweb","DigitarUsuario","DigitarSenha").getConexao();
	}
	
	
	@Override
	public void Excluir(Usuario usuario) {
		String sql="DELETE FROM usuario WHERE id_usuario= ?";
		System.out.println(sql);
		try{
			PreparedStatement comando=conn.prepareStatement(sql);
			comando.setInt(1,usuario.getId());
			comando.execute();
			comando.close();
			System.out.println("Excluido com secesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}

	@Override
	public void Alterar(Usuario usuario) {
		String sql="UPDATE usuario SET nome=?, SET login=?, SET senha=? WHERE id_usuario= ? ";
		System.out.println(sql);
		try{
			PreparedStatement comando=conn.prepareStatement(sql);
			comando.setString(1,usuario.getNome());
			comando.setString(2,usuario.getLogin());
			comando.setString(3,usuario.getSenha());
			comando.setInt(4,usuario.getId());
			comando.execute();
			comando.close();
			System.out.println("Alterado com secesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}

	@Override
	public void Incluir(Usuario usuario) {
		
		System.out.println(usuario.getNome());
		System.out.println(usuario.getLogin());
		System.out.println(usuario.getSenha());
		
		String sql="INSERT INTO usuario(nome,login,senha) VALUES(?,?,?)";
		System.out.println(sql);
		System.out.println(conn);
		try{
			PreparedStatement comando=conn.prepareStatement(sql);
			comando.setString(1,usuario.getNome());
			comando.setString(2,usuario.getLogin());
			comando.setString(3,usuario.getSenha());
			comando.execute();
			comando.close();
			System.out.println("inserido com secesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Usuario Buscar(Usuario id) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public Usuario BuscarTodos(Usuario usuario) {
		return null;
		
	}

}
