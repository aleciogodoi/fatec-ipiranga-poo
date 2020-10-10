public class Quadrado extends Retangulo {
	public Quadrado() {	
	}
	
	public Quadrado(double lado1, String cor) {
		super(lado1, lado1, cor);
	}
	@Override
	public String toString() {
		return "Quadrado [lado=" + getLado1() + ", area()=" + area() 
				+ ", cor=" + getCor() + "]";
	}
}
