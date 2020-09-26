public class Operadores {
	public static void main(String[] args) {
		System.out.println("Resto 5 % 2 = " + (5 % 2) );
		int x = 5;
		int y = -x;
		System.out.println("valor de x = " + x);
		System.out.println("valor de y = " + y);
		y = --x;
		System.out.println("valor de x = " + x);
		System.out.println("valor de y = " + y);
		y = x--;
		System.out.println("valor de x = " + x);
		System.out.println("valor de y = " + y);
		y /= x;
		System.out.println("valor de y = " + y);

	}
}
