package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySql {
	
	private static Connection conexao;
	private static String status_da_conexao;
	
	public static Connection abrirConexaoMySQL(){
		String servidor="localhost";
		String banco="studycards";
		String usuario="athos";
		String senha="2003";
		String url="jdbc:mysql://"+servidor+":3306/"+banco;
		
		try {
			conexao=DriverManager.getConnection(url,usuario,senha);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return conexao;
		}
		
		if(conexao != null)
			status_da_conexao="STATUS--> Conexao com o banco realizada com sucesso!";
		else
			status_da_conexao="STATUS--> Falha na conexao com o banco!";
		
		return conexao;
		
	}
	
	public static void obterStatusConexao(){
		System.out.println(status_da_conexao);
	}
	
	public static void fecharConexao(){
		try {
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		ConexaoMySql.abrirConexaoMySQL();
		ConexaoMySql.obterStatusConexao();	
	}
	
}
