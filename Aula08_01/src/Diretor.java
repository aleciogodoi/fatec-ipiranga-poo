
public class Diretor extends Gerente {
	private String unidade;
	
	public Diretor() {	
	}
	
	public Diretor(String nome, double salario, String unidade) {
		super(nome, salario);
		this.unidade = unidade;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	@Override
	public String toString() {
		return "Diretor [unidade=" + unidade + ", " + super.toString() + "]";
	}
	
}
