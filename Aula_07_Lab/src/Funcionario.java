public class Funcionario extends Pessoa{
	private float salario;
	private static int qtdFuncionarios;
	public Funcionario(String nome,  Data nascimento, float salario ) {
		super(nome, nascimento);
		this.salario = salario;
		if ( !(this instanceof Gerente) )
			qtdFuncionarios++;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [Salario=" + salario + ", Imposto= " + calculaImposto() + ", "+ super.toString() + "]";
	}
	
	public float calculaImposto() {
		return this.salario * .03f;
	}
	
	public static int getTotal() {
		return qtdFuncionarios;
	}
}
