public class Pessoa {
	private String nome;
	private Data nascimento;
	
	public Pessoa() {
	}
	public Pessoa(String nome, Data nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Data getNascimento() {
		return nascimento;
	}
	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nascimento=" + nascimento + "]";
	}
	public void ImprimeDados() {
		System.out.println(this.toString());
	}
	
}
