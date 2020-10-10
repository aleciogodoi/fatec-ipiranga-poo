
public class Secretario extends Funcionario implements Calculos {
	
	public Secretario() {
		super();
	}

	public Secretario(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calculaBonificacao() {
		return this.getSalario() * .2;
	}

	@Override
	public double descontoSalario() {
		return this.getSalario() * .1;
	}

	
}
