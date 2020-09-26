public class TestaRetangulo {
	public static void main(String[] args) {
		Retangulo r01 = new Retangulo();
		Retangulo r02 = new Retangulo();
	
		//System.out.println(r01);	
		r01.altura = 10.5;
		r01.base = 7.8;
		r01.cor = "azul";
		r01.imprimirDados();
		
		//System.out.println(r02);	
		r02.altura = 5.25;
		r02.base = 6.84;
		r02.cor = "vermelho";
		r02.imprimirDados();
		
		System.out.println("\n\nVetor de Retangulo\n");
		Retangulo[] retangulos = new Retangulo[4];
		for (int i=0; i < retangulos.length; i++) {
			retangulos[i] = new Retangulo();
			retangulos[i].altura = i * 2 + 5;
			retangulos[i].base = i * 1.5 + 4;
			retangulos[i].cor = "Cor "+i;
			retangulos[i].imprimirDados();
		}
	}
}
