public class Gerente extends Funcionario{
	
	private String area;
	private static int qtdGerentes;
	public Gerente(String nome, Data nascimento, float salario, String area) {
		super(nome, nascimento, salario);
		this.area = area;
		qtdGerentes++;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Gerente [area=" + area +"," + super.toString() + "]";
	}
	
	@Override
	public float calculaImposto() {
		return this.getSalario() * .05f;
	}
	
	public static int getTotal() {
		return qtdGerentes;
	}
}
