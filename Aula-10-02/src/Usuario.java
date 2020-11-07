public class Usuario {

	// Atributos
	private int idUsuario;
	private String nome;
	private String email;
	private String telefone;
	private String endereco;	
	
	// Construtores
	Usuario(){
	}
	
	Usuario (int idUsuario, String nome, String email, String telefone, String endereco ){
		setIdUsuario(idUsuario);
		setNome(nome);
		setEmail(email);
		setTelefone(telefone);
		setEndereco(endereco);
	}
	
	// Metodos
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone
				+ ", endereco=" + endereco + "]";
	}

}
