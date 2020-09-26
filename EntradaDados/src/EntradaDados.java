import java.util.Scanner;  
public class EntradaDados {
	public static void main(String[] args) {
		Scanner meuScanner = new Scanner(System.in);
		System.out.println("Entre com seu nome: ");
		String nome = meuScanner.nextLine();
		System.out.println("Seu nome é: " + nome);
		
		System.out.println("Entre com a Nota 1: ");
		float nota1 = meuScanner.nextFloat();		
		System.out.println("Entre com a Nota 2: ");
		float nota2 = meuScanner.nextFloat();
		float media = (nota1 + nota2) / 2;
		System.out.println("Média: " + media  );
	}
}
