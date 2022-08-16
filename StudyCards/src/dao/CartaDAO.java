package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Carta;

public class CartaDAO {
	private Connection conexao;
	private PreparedStatement preps = null;
	private String sql = null;
	private Carta carta;
	private ArrayList<Carta> lista_cartas;
	
	public CartaDAO(Carta carta) {
		this.carta = carta;
	}
	
	public boolean salvar_carta_no_banco() {
		boolean flag = false;
		iniciar_conexao();
		flag = realizar_sql_insertion();
		ConexaoMySql.fecharConexao();
		return flag;
	}
	
	private void iniciar_conexao() {
		conexao = ConexaoMySql.abrirConexaoMySQL();
		ConexaoMySql.obterStatusConexao();
	}
	
	private boolean realizar_sql_insertion() {
		boolean flag = false;
		
		sql = "insert into carta (id,titulo,frente,verso)"
				+ " values (DEFAULT, ?, ?, ?)";
		
		try {
			preps = conexao.prepareStatement(sql);
			preps.setString(1, carta.getTitulo());
			preps.setString(2, carta.getFrente());
			preps.setString(3, carta.getVerso());
			
			int resposta = preps.executeUpdate();
			
			if(resposta == 1)
				flag = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public ArrayList<Carta> resgatar_cartas_do_banco(){
		iniciar_conexao();
		realizar_sql_selection();
		ConexaoMySql.fecharConexao();
		return lista_cartas;
	}
	
	private void realizar_sql_selection() {
		
		sql = "select titulo,frente,verso from carta";
		
		try {
			preps = conexao.prepareStatement(sql);
			ResultSet resultado_da_consulta = preps.executeQuery();
			coletar_resultset(resultado_da_consulta);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void coletar_resultset(ResultSet result){
		try {
			lista_cartas = new ArrayList<Carta>();
			while(result.next()) {
				lista_cartas.add(coletar_carta(result));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private Carta coletar_carta(ResultSet result) throws SQLException {
		String[] carta_dados = new String[3];
		carta_dados[0] = result.getString(1);
		carta_dados[1] = result.getString(2);
		carta_dados[2] = result.getString(3);
		
		return new Carta(carta_dados);
	}
	
}
