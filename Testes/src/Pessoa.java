public class Pessoa {
	private String CPF;
	private String Nome;
	
	public Pessoa() {
	}
	
	public Pessoa(String cPF, String nome) {
		super();
		CPF = cPF;
		Nome = nome;
	}
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
}
