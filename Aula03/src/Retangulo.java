public class Retangulo {
	// Atributos
	double base;
	double altura;
	String cor;
	
	// Metodos
	public double calcularArea() {
		return base * altura;
	}
	
	public double calcularPerimetro() {
		return 2 * (base + altura);
	}

	public void imprimirDados() {
		System.out.println("[Cor = "+cor 
				+", Altura = "+altura
				+", Base = "+base
				+", Perimetro = "+calcularPerimetro()
				+", Area = "+calcularArea()
				+"]"
		);
		
	}
}
