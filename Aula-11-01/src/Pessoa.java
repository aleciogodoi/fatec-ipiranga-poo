import java.sql.Date;

public class Pessoa {
	private int idPessoa;
	private String nome;
	private double peso;
	private double altura;
	private int idade;
	private Date dtNascimento;
	
	public Pessoa() {
		super();
	}
	public Pessoa(int idPessoa, String nome, double peso, double altura, int idade, Date dtNascimento) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
		this.dtNascimento = dtNascimento;
	}
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + ", idade="
				+ idade + ", dtNascimento=" + dtNascimento + "]";
	}
}
