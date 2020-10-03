public class Gerente extends Funcionario{
	
	private String area;
	
	public Gerente(String area,float salario, String nome, Data nascimento) {
		super(salario, nome, nascimento);
		this.area = area;
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
}
