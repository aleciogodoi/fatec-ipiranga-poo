public class Funcionario extends Pessoa{
	private float salario;

	public Funcionario(float salario, String nome, Data nascimento ) {
		super(nome, nascimento);
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [Salario=" + salario + ", " + super.toString() + "]";
	}
	
	public float calculaImposto() {
		return this.salario * .03f;
	}
}
