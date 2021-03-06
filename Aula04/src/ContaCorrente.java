public class ContaCorrente {
	private String numero;
	private String nome;
	private char sexo;
	private int idade;
	private boolean contaConjunta;
	private float saldo;

	// Construtor sem parametros
	ContaCorrente(){
	}
	
	// Construtor com parametros
	ContaCorrente(	String numero, String nome,
					char sexo, int idade, boolean contaConjunta
				 ){
		this.numero = numero;
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.contaConjunta = contaConjunta;
	}
	
	public void saque(float valor) {
		if(valor <= 0) {
			System.out.println("Saque com valor inv�lido!!! ("+valor+")");
		} else {
			if (this.saldo >= valor) {
				this.saldo -= valor; 
				this.saldo();
			} else {
				System.out.println("Sem saldo para o saque!!!");
			}
		}
	}
	
	public void deposito(float valor) {
		if(valor > 0) {
			this.saldo += valor; 
			this.saldo();
		} else {
			System.out.println("Deposito com valor inv�lido!!! ("+valor+")");
		}	
	}
	
	public void saldo() {
		System.out.println("------------------------------------------");
		System.out.println("Nome: "+this.nome + " Nr. Conta: "+this.getNumero());
		if (this.isContaConjunta())
			System.out.print("Conta Conjunta: Sim");
		else
			System.out.print("Conta Conjunta: N�o");
		System.out.print("\tSaldo: "+this.getSaldo());
		System.out.println("\n------------------------------------------");
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isContaConjunta() {
		return contaConjunta;
	}
	public void setContaConjunta(boolean contaConjunta) {
		this.contaConjunta = contaConjunta;
	}
	public float getSaldo() {
		return saldo;
	}
	
}
