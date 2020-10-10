public abstract class Calcular implements CalculoMatematico{
	private int resultado;
	public void setResultado(int num) {
		this.resultado = num;
	}
	public int getResultado() {
		return resultado;
	}
	public void Soma (int x, int y){
		resultado = x + y;
	}
	public void Imprimir (){
		System.out.println("resultado da Soma é: " + resultado);
	}
}