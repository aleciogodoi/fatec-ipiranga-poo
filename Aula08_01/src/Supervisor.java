public class Supervisor extends Funcionario implements Calculos{
	
	public Supervisor() {
		super();
	}

	public Supervisor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calculaBonificacao() {
		return this.getSalario() * .3;
	}

	@Override
	public double descontoSalario() {
		return this.getSalario() * .15;
	}

}
