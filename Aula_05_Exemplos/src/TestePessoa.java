
public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p01 = new Pessoa(1,"Vitor");
		Pessoa p02 = new Pessoa(2,"Caroline");
		Pessoa p03 = new Pessoa(3,"Guilherme");
		Pessoa p04 = new Pessoa(4,"Vicente");
		Pessoa p05 = new Pessoa(10,"Aline");

		System.out.println(Pessoa.getTotalPessoas());
	}

}
