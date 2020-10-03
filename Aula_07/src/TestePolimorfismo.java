import java.util.Random;

public class TestePolimorfismo {
	public static void main(String args[]) {
		
		// gera numeros randômicos
		Random r = new Random();
		int n = r.nextInt(100);
		Bicho b;
		if (n < 33) {
			b = new Cachorro();	
		} else if (n >= 33 && n < 66) {
			b = new Gato();
		}  else {
			b = new Passaro();
		} 
		System.out.println(n);
		b.fala();
	
	}
}