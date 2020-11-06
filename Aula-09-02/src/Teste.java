import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teste {
	public static void main(String[] args) {
		// Objeto Connection
		Connection conn;
		// Objeto conexao
		Conexao conexao = new Conexao();
		// Executa o metodo para abrir uma conexão 
		conn = conexao.conectar();
	
		// Definição comando Select
		String sql = "Select idDepto, nomeDepto, Local From Departamento";
		System.out.println("Dados do Departamento");
		try {
			// Criar um objeto para execução de comandos SQL
			Statement comandoSQL = conn.createStatement();
			// Resultado da consulta
			ResultSet rs = comandoSQL.executeQuery(sql);
			while (rs.next()) {      // Lê registros e imprime
				System.out.println(
						rs.getInt("idDepto")+ " - " +
						rs.getString("nomeDepto") + " - " +
						rs.getString("Local") 
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		sql = "Select IdEmpregado, NomeEmpregado, Salario From Empregado";
		System.out.println("\n\nDados do Funcionário");
		try {
			// Criar um objeto para execução de comandos SQL
			Statement comandoSQL = conn.createStatement();
			// Resultado da consulta
			ResultSet rs = comandoSQL.executeQuery(sql);
			while (rs.next()) {      // Lê registros e imprime
				System.out.println(
						rs.getInt("idEmpregado")+ " - " +
						rs.getString("NomeEmpregado") + " - " +
						rs.getDouble("Salario") 
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		// Executa o metodo para fechar a conexão
		conexao.fecharConexao(conn);
	}
}
