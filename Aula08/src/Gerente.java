
public class Gerente extends Funcionario{
	
	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaBonificacao() {
		return this.getSalario() * 0.4;
	}
}
