public class Supervisor extends Funcionario {
	
	public Supervisor() {
		super();
	}

	public Supervisor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calculaBonificacao() {
		return this.getSalario() * 0.3;
	}
}
