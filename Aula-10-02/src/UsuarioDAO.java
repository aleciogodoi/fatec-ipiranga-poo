import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class UsuarioDAO {
	
	private Conexao conexao = new Conexao();
	private String sqlInsert;
	private String sqlUpdate;
	private String sqlDelete;
	private String sqlSelect;	
	private String sqlSelectId;
	private String sqlSelectNome;
	private String sqlSelectEmail;
	private PreparedStatement st;
	private static Connection conn = null; 
    private ResultSet rs;
	
	UsuarioDAO () {
		sqlInsert = "Insert Into Usuario (IdUsuario, Nome, Email, Telefone, Endereco) Values (?, ?, ?, ?, ?)";
		sqlUpdate = "Update Usuario Set Nome = ?, Email = ?, Telefone = ?, Endereco = ? Where IdUsuario = ?";
		sqlDelete = "Delete From Usuario Where IdUsuario = ?";
		sqlSelect = "Select IdUsuario, Nome, Email, Telefone, Endereco From Usuario";
		sqlSelectId = sqlSelect + " Where IdUsuario = ?"; 
		sqlSelectNome = sqlSelect + " Where Nome Like ?";
		sqlSelectEmail = sqlSelect + " Where Email Like ?";
	}

	public Usuario select(int idUsuario) {
		conn = conexao.conectar();
		Usuario usuario = new Usuario();

		try {
			st = conn.prepareStatement(sqlSelectId);
			st.setInt(1, idUsuario);
			System.out.println(sqlSelectId);
			rs = st.executeQuery();
			if (rs.next()) {
				usuario.setIdUsuario(rs.getInt("idUsuario"));
				usuario.setNome(rs.getString("nome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setTelefone(rs.getString("telefone"));
				usuario.setEndereco(rs.getString("endereco"));
			} else {
				usuario = null;
			}
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro de execução comando \n" + sqlSelectId+"\n"+e);
		}
		finally{
			conexao.fecharConexao(conn);
			return usuario;
		}
	}
	
	public Usuario select(String texto, String campo) {
		texto +="%";
		conn = conexao.conectar();
		Usuario usuario = new Usuario();
		String sql="";

		if (campo.equals("nome"))
			sql = sqlSelectNome;
		else
			sql = sqlSelectEmail; 
		
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, texto);
			rs = st.executeQuery();
			if (rs.next()) {
				usuario.setIdUsuario(rs.getInt("idUsuario"));
				usuario.setNome(rs.getString("nome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setTelefone(rs.getString("telefone"));
				usuario.setEndereco(rs.getString("endereco"));
			} else {
				usuario = null;
			}
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro de execução comando \n" + sql +"\n"+e);
		}
		finally{
			conexao.fecharConexao(conn);
			return usuario;
		}
	}
	
	public void insert(Usuario usuario){
		conn = conexao.conectar();
		try {
			st = conn.prepareStatement(sqlInsert);
			st.setInt(1, usuario.getIdUsuario());
			st.setString(2, usuario.getNome());
			st.setString(3, usuario.getEmail());
			st.setString(4, usuario.getTelefone());
			st.setString(5, usuario.getEndereco());
			st.executeUpdate();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro de execução comando \n" + sqlInsert+"\n"+e);
		}
		finally{
			conexao.fecharConexao(conn);
		}
	}
	
	public void update(Usuario usuario){
		conn = conexao.conectar();
		try {
			st = conn.prepareStatement(sqlUpdate);
			st.setString(1, usuario.getNome());
			st.setString(2, usuario.getEmail());
			st.setString(3, usuario.getTelefone());
			st.setString(4, usuario.getEndereco());
			st.setInt(5, usuario.getIdUsuario());			
			st.executeUpdate();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro de execução comando \n" + sqlUpdate+"\n"+e);
		}
		finally{
			conexao.fecharConexao(conn);
		}
	}
	
	public void delete(int IdUsuario){
		conn = conexao.conectar();
		try {
			st = conn.prepareStatement(sqlDelete);
			st.setInt(1, IdUsuario);
			st.executeUpdate();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro de execução comando \n" + sqlDelete+"\n"+e);
		}
		finally{
			conexao.fecharConexao(conn);
		}
	}
	
	public ArrayList<Usuario> getUsuarios() {
		conn = conexao.conectar();
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		try {
			st = conn.prepareStatement(sqlSelect);
			rs = st.executeQuery();
			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setIdUsuario(rs.getInt("idUsuario"));
				usuario.setNome(rs.getString("nome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setTelefone(rs.getString("telefone"));
				usuario.setEndereco(rs.getString("endereco"));
				usuarios.add(usuario);
			}
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro de execução comando \n" + sqlSelect +"\n"+e);
		}
		finally{
			conexao.fecharConexao(conn);
			return usuarios;
		}
	}
	
}
