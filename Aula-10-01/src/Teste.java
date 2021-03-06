import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teste {
	public static void main(String[] args) {
		//insert(1,"Caroline", 45.2, 1.65, 19 );
		//insert(2,"Ueslei", 70.77, 1.75, 22 );
		//insert(3,"Leonardo", 74.2, 1.73, 23 );
		//insert(4,"Djane", 45, 1.64, 19 );
		insert(5,"Alecio", 74, 1.77, 18 );
		select();
		update(3,"Leonardo", 77.2, 1.73, 28 );
		delete(5);
		select();
	}
	public static void delete(int idPessoa) {
		// Objeto Connection
		Connection conn;
		// Objeto conexao
		Conexao conexao = new Conexao();
		// Executa o metodo para abrir uma conex�o 
		conn = conexao.conectar();
		// Defini��o comando Select
		String sql = "Delete From Pessoa Where idPessoa="+idPessoa;
		System.out.println(sql);
		try {
			// Criar um objeto para execu��o de comandos SQL
			Statement comandoSQL = conn.createStatement();
			// Resultado da consulta
			comandoSQL.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// Executa o metodo para fechar a conex�o
		conexao.fecharConexao(conn);		
	}
	public static void update(int idPessoa, String nome, double peso, double altura, double idade) {
		// Objeto Connection
		Connection conn;
		// Objeto conexao
		Conexao conexao = new Conexao();
		// Executa o metodo para abrir uma conex�o 
		conn = conexao.conectar();
		// Defini��o comando Select
		String sql = "Update Pessoa Set "
					+ "  Nome='"+nome+"'"
					+ ", Peso="+peso
					+ ", Altura="+altura
					+ ", Idade= "+idade
					+ " Where idPessoa="+idPessoa;
		System.out.println(sql);
		try {
			// Criar um objeto para execu��o de comandos SQL
			Statement comandoSQL = conn.createStatement();
			// Resultado da consulta
			comandoSQL.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// Executa o metodo para fechar a conex�o
		conexao.fecharConexao(conn);		
	
	}
	
	public static void insert(int idPessoa, String nome, double peso, double altura, double idade) {
		// Objeto Connection
		Connection conn;
		// Objeto conexao
		Conexao conexao = new Conexao();
		// Executa o metodo para abrir uma conex�o 
		conn = conexao.conectar();
		// Defini��o comando Select
		String sql = "Insert Into Pessoa (idPessoa, Nome, Peso, Altura, Idade)"
				   + "Values ("+idPessoa+", '"+nome+"', "+peso+", "+altura+", "+idade+")";
		System.out.println(sql);
		try {
			// Criar um objeto para execu��o de comandos SQL
			Statement comandoSQL = conn.createStatement();
			// Resultado da consulta
			comandoSQL.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// Executa o metodo para fechar a conex�o
		conexao.fecharConexao(conn);		
	
	}
	
	public static void select() {
		// Objeto Connection
		Connection conn;
		// Objeto conexao
		Conexao conexao = new Conexao();
		// Executa o metodo para abrir uma conex�o 
		conn = conexao.conectar();
	
		// Defini��o comando Select
		String sql = "Select idPessoa, Nome, Peso, Altura, Idade From Pessoa";
		System.out.println("Dados de Pessoa");
		try {
			// Criar um objeto para execu��o de comandos SQL
			Statement comandoSQL = conn.createStatement();
			// Resultado da consulta
			ResultSet rs = comandoSQL.executeQuery(sql);
			while (rs.next()) {      // L� registros e imprime
				System.out.println(
						rs.getInt("idPessoa")+ " - " +
						rs.getString("Nome") + " - " +
						rs.getDouble("Peso") + " - " +
						rs.getDouble("Altura") + " - " +
						rs.getInt("Idade")
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
		// Executa o metodo para fechar a conex�o
		conexao.fecharConexao(conn);
	}
}
