public class FuncoesMatematicas {
	public static int exponencial(int x, int y) {
		if (y == 0)
			return 1;
		return x * exponencial(x, y - 1);
	}

	public static int fatorial(int x) {
		if (x == 0)
			return 1;
		return x * fatorial(x - 1);
	}
	
	public static int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n-1) + fib(n-2);
	}
	
}