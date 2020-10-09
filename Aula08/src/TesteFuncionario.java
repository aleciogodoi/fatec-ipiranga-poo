import java.util.ArrayList;

public class TesteFuncionario {
	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

		funcionarios.add(new Secretario("José", 5423.21));
		funcionarios.add(new Supervisor("Maria", 7821.45));
		funcionarios.add(new Gerente("Guilherme", 10123.87));
		funcionarios.add(new Diretor("Ana", 15983.76, "Paulista"));
		
		for (Funcionario funcionario: funcionarios) {
			System.out.println(funcionario + " Bonificação: " + funcionario.calculaBonificacao());
		}
	}
}
