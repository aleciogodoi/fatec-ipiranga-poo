import java.util.ArrayList;

public class TesteFiguras {
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<Figura>();	
		figuras.add(new Retangulo(5, 2, "azul"));
		figuras.add(new Quadrado(5, "vermelho"));
		figuras.add(new Triangulo(5, 2, "cinza"));
		figuras.add(new Circulo(5.2, "amarelo"));
		
		for (Figura figura: figuras) {
			System.out.println(figura);
		}
	}
}
