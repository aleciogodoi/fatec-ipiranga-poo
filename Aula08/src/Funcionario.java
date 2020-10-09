public abstract class Funcionario {
	private String nome;
	private double salario;
	
	// Metodo abstrato
	public abstract double calculaBonificacao();
	
	public Funcionario() {
	}
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}
}
