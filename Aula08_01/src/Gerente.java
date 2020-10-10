
public class Gerente extends Funcionario implements Calculos{
	
	public Gerente() {
		super();
	}

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calculaBonificacao() {
		return this.getSalario() * .25;
	}

	@Override
	public double descontoSalario() {
		return this.getSalario() * .125;
	}

}
