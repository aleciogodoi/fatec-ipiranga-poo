import java.util.Scanner;

public class Desvio {
	public static void main(String[] args) {
		Scanner meuScanner = new Scanner(System.in);
		System.out.println("Entre com número ");
		int n = meuScanner.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " É par!");
		} else {
			System.out.println(n + " É impar!");
		}
			
		/*
		String mens = " É impar!";
		if (n % 2 == 0) {
			mens = " É par!";
		}
		System.out.println(n + mens);
		*/
	}
}
