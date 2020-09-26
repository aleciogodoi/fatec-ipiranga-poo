
public class Relacionais {
	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		String nome = "Maria";

		System.out.println("x == y -> " + (x == y) );
		System.out.println("x <  y -> " + (x < y) );
		System.out.println("x <= y -> " + (x <= y) );
		System.out.println("x >= y -> " + (x >= y) );
		System.out.println("x != y -> " + (x != y) );
		System.out.println("nome == 'Maria' -> " + (nome == "Maria") );
		System.out.println("nome == 'maria' -> " + (nome == "maria") );
		//System.out.println("nome == 'maria' -> " + ((nome.toLowerCase()) == "maria"));

		System.out.println("x != y && x < y " + (x != y && x < y) );
		System.out.println("x != y && x > y " + (x != y && x > y) );
		System.out.println("x != y || x < y " + (x != y || x < y) );
		System.out.println("x != y || x > y " + (x != y || x > y) );
	}
}
