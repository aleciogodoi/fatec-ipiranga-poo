import java.util.Scanner;

public class Desvio {
	public static void main(String[] args) {
		Scanner meuScanner = new Scanner(System.in);
		System.out.println("Entre com n�mero ");
		int n = meuScanner.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " � par!");
		} else {
			System.out.println(n + " � impar!");
		}
			
		/*
		String mens = " � impar!";
		if (n % 2 == 0) {
			mens = " � par!";
		}
		System.out.println(n + mens);
		*/
	}
}
