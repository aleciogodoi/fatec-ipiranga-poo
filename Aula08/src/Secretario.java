
public class Secretario extends Funcionario {
	
	public Secretario() {
		super();
	}

	public Secretario(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calculaBonificacao() {
		return this.getSalario() * 0.2;
	}
}
