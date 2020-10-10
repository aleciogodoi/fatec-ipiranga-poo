import java.util.Scanner;
public class TesteCalculo extends Calcular {
	static TesteCalculo teste; 
	Scanner scan = new Scanner (System.in);
	public TesteCalculo(){
		System.out.println("Digite o primeiro valor");
		int x = scan.nextInt();
		System.out.println("Digite o segundo valor");
		int y = scan.nextInt();
		Soma(x,y);
		Imprimir();
	}
	public static void main(String[] args) {
		teste = new TesteCalculo();
	}
	@Override
	public void Subtracao(int x, int y) { teste.setResultado( x - y );}
	@Override
	public void Multiplicacao(int x, int y) { }
	@Override
	public void Divisao(float x, float y) { }
}
