public class TesteContaCorrente {
	public static void main(String[] args) {
		ContaCorrente c01 = new ContaCorrente();
		c01.setNome("Pedro");
		c01.setIdade(27);
		c01.setNumero("12465-09");
		c01.setSexo('M');
		c01.saldo();
		c01.deposito(3245.32f);
		c01.deposito(1000.00f);
		c01.deposito(0.0f);	
		c01.deposito(-1000.00f);
		c01.saque(1500);
		c01.saque(2500);
		c01.saque(200);
		c01.saque(50);
		
		ContaCorrente c02 = new ContaCorrente("665544-X","Maria",'F',25,false);
		c02.saldo();
	}
}
