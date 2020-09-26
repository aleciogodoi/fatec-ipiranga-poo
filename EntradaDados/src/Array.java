public class Array {
	public static void main(String[] args) {	
		String[] carros = {"Volvo", "BMW", "Ford", "Mazda", "Fiat"};
		int[] numeros = {3, 5, 20, 76, 58, 32};
		
		System.out.println("tamanho carros = " + carros.length );
		for(int i=0; i < carros.length; i++) {
			System.out.print(carros[i] + "\t");
		}
		
		carros[3] = "New Mazda";
		System.out.println("\n\n"+carros[3]);
		
		for(String carro : carros) {
			System.out.print(carro + "\t");
		}
			
		System.out.println("\n\ntamanho numeros = "+numeros.length);	
		for(int i=0; i < numeros.length; i++) {
			System.out.print(numeros[i]+ "\t");
		}	
	}
}
