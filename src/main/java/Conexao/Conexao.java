package Conexao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	/**
	 * Breno Silva
	 * 
	 * */
	
		   private Connection conexao;
		
        
		    public Conexao(String driver, String dbURL, String login, String passoword) {
		        try {
		            Class.forName(driver);
		            conexao = DriverManager.getConnection(dbURL, login, passoword);
		        } catch (ClassNotFoundException e) {
		            System.out.println("N�o foi poss�vel carregar driver JDBC com o erro: ");
		            e.printStackTrace();
		        } catch (SQLException e) {
		            System.err.println("N�o foi poss�vel conectar no PostgreSQL com o erro: ");
		            e.printStackTrace();
		        }
		        catch (Exception e){
		            e.printStackTrace();
		        }
		    }

		    public Connection getConexao() {
		        return conexao;
		    }
		
			   

			}
			
			
			
		
	


