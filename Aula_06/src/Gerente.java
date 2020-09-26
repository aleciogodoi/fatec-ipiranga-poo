public class Gerente extends Funcionario {
	private int senha;
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public String toString() {
		return "Gerente - " + super.toString();
	}

	public boolean autentica(int senha) {
		if(senha==1234) {
			return true;
		}
		return false;
	}
	
	
}
