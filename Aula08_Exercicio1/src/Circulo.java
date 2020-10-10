public class Circulo extends Figura{
	private double raio;
	
	public Circulo() {
		super();
	}
	public Circulo(double raio, String cor) {
		super(cor);
		this.raio = raio;
	}
	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
	public double getDiamentro() {
		return 2 * raio;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", area()=" + area() + ", getDiamentro()=" + getDiamentro() + ", "
				+ super.toString() + "]";
	}
}
