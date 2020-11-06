import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teste2 {

	public static void main(String[] args) {
		// Objeto Connection
		Connection conn;
		// Objeto conexao
		Conexao conexao = new Conexao();
		// Executa o metodo para abrir uma conex�o 
		conn = conexao.conectar();
	
		// Defini��o comando 
		/*
		String sql = "Insert Into Departamento (idDepto, NomeDepto, Gerente, Divisao, Local) "
						+ "Values (1001,'Marketing', 1, 'SUDESTE', 'S�O PAULO')";
						
		String sql = "Update Departamento Set Gerente=101, Local = 'S�O PAULO', Divisao='Leste' Where idDepto = 1001";
		*/
		String sql = "Delete From Departamento Where idDepto = 1001";
		System.out.println("Dados de Departamento");
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

}
