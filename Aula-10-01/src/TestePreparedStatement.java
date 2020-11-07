import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestePreparedStatement {
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
		// Executa o metodo para abrir uma conexão 
		conn = conexao.conectar();
		// Definição comando Select
		String sql = "Delete From Pessoa Where idPessoa = ?";
		System.out.println(sql);
		try {
			// Criar um objeto para execução de comandos SQL
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			// Resultado da consulta
			comandoSQL.setInt(1, idPessoa);
			comandoSQL.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// Executa o metodo para fechar a conexão
		conexao.fecharConexao(conn);		
	}
	public static void update(int idPessoa, String nome, double peso, double altura, int idade) {
		// Objeto Connection
		Connection conn;
		// Objeto conexao
		Conexao conexao = new Conexao();
		// Executa o metodo para abrir uma conexão 
		conn = conexao.conectar();
		// Definição comando Select
		String sql = "Update Pessoa Set "
					+ "  Nome  = ?"
					+ ", Peso  = ?"
					+ ", Altura= ?"
					+ ", Idade = ?"
					+ " Where idPessoa = ?";
		System.out.println(sql);
		try {
			// Criar um objeto para execução de comandos SQL
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setString(1,nome);
			comandoSQL.setDouble(2,peso);
			comandoSQL.setDouble(3,altura);
			comandoSQL.setInt(4,idade);
			comandoSQL.setInt(5,idPessoa);
			
			// Resultado da consulta
			comandoSQL.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// Executa o metodo para fechar a conexão
		conexao.fecharConexao(conn);		
	
	}
	
	public static void insert(int idPessoa, String nome, double peso, double altura, int idade) {
		// Objeto Connection
		Connection conn;
		// Objeto conexao
		Conexao conexao = new Conexao();
		// Executa o metodo para abrir uma conexão 
		conn = conexao.conectar();
		// Definição comando Select
		String sql = "Insert Into Pessoa (idPessoa, Nome, Peso, Altura, Idade)"
				   + "Values             (?       , ?   , ?   , ?     , ?)";
		System.out.println(sql);
		try {
			// Criar um objeto para execução de comandos SQL
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setInt(1, idPessoa);
			comandoSQL.setString(2, nome);
			comandoSQL.setDouble(3, peso);
			comandoSQL.setDouble(4, altura);
			comandoSQL.setInt(5, idade);
			// Resultado da consulta
			comandoSQL.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// Executa o metodo para fechar a conexão
		conexao.fecharConexao(conn);		
	
	}
	
	public static void select() {
		// Objeto Connection
		Connection conn;
		// Objeto conexao
		Conexao conexao = new Conexao();
		// Executa o metodo para abrir uma conexão 
		conn = conexao.conectar();
	
		// Definição comando Select
		String sql = "Select idPessoa, Nome, Peso, Altura, Idade From Pessoa";
		System.out.println("Dados de Pessoa");
		try {
			// Criar um objeto para execução de comandos SQL
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			// Resultado da consulta
			ResultSet rs = comandoSQL.executeQuery();
			while (rs.next()) {      // Lê registros e imprime
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
		
	
		// Executa o metodo para fechar a conexão
		conexao.fecharConexao(conn);
	}
}
