import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PessoaDAO {
	private Conexao conexao = new Conexao();
	private String sqlSelect = "Select idPessoa, Nome, "
			                   + "Peso, Altura, Idade, DtNascimento "
			                   + "From Pessoa";
	
	private String sqlSelectId = sqlSelect+" Where idPessoa = ?";
	
	private String sqlInsert = "Insert Into Pessoa "
							  + " (idPessoa, Nome, Peso, Altura, "
							  + "  Idade, DtNascimento ) "
							  + "Values (?, ?, ?, ?, ?, ?)";
	
	private String sqlUpdate = "Update Pessoa "
							  + " Set Nome = ?, Peso = ?, Altura = ?, Idade = ?, DtNascimento = ?"
							  + " Where idPessoa = ?";
	
	private String sqlDelete = "Delete From Pessoa Where idPessoa = ?";
	
	public ArrayList<Pessoa> select() {
		// Criar conex�o com a base de dados
		Connection conn = conexao.conectar();
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		try {
			PreparedStatement sqlComando = conn.prepareStatement(sqlSelect);
			ResultSet resultado = sqlComando.executeQuery();
			while(resultado.next()) {
				pessoas.add(new Pessoa(
									resultado.getInt("idPessoa"),
									resultado.getString("Nome"),
									resultado.getDouble("Peso"),
									resultado.getDouble("Altura"),
									resultado.getInt("Idade"),
									resultado.getDate("DtNascimento")
								)
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conexao.fecharConexao(conn);
		}
		return pessoas;
	}
	
	public void insert(Pessoa pessoa) {
		// Cria conex�o com a base de dados
		Connection conn = conexao.conectar();
		try {
			// Cria o comando SQL a ser executado
			PreparedStatement sqlComando = conn.prepareStatement(sqlInsert);
			// Seta valores para o Insert
			sqlComando.setInt(1, pessoa.getIdPessoa());
			sqlComando.setString(2, pessoa.getNome());
			sqlComando.setDouble(3, pessoa.getPeso());
			sqlComando.setDouble(4, pessoa.getAltura());
			sqlComando.setInt(5, pessoa.getIdade());
			sqlComando.setDate(6, pessoa.getDtNascimento());
			// Executa comando SQL
			sqlComando.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conexao.fecharConexao(conn);
		}
	}
	

}
