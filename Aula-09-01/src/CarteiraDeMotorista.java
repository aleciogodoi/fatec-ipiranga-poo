public class CarteiraDeMotorista {
	
	private String nome;
	private int idade;
	
	public CarteiraDeMotorista (String n, int i) {
		this.nome = n;
		this.idade = i;

		if (this.idade < 18) 
			throw new IdadeInsuficienteException ("A idade é insuficiente!");
	}	
}


