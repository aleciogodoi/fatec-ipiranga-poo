import java.util.ArrayList;

public class TesteFuncionario {
	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

		funcionarios.add(new Secretario("José", 5423.21));
		funcionarios.add(new Supervisor("Maria", 7821.45));
		funcionarios.add(new Gerente("Guilherme", 10123.87));
		funcionarios.add(new Diretor("Ana", 15983.76, "Paulista"));
		funcionarios.add(new Presidente("Marcos", 25983.76));
		

		System.out.println(funcionarios.get(0) + " - Bonificação: "+((Secretario)funcionarios.get(0)).calculaBonificacao() +
												 " - Desconto: "+((Secretario)funcionarios.get(0)).descontoSalario());
		System.out.println(funcionarios.get(1) + " - Bonificação: "+((Supervisor)funcionarios.get(1)).calculaBonificacao() +
												 " - Desconto: "+((Supervisor)funcionarios.get(1)).descontoSalario());
		System.out.println(funcionarios.get(2) + " - Bonificação: "+((Gerente)funcionarios.get(2)).calculaBonificacao());
		System.out.println(funcionarios.get(3) + " - Bonificação: "+((Diretor)funcionarios.get(3)).calculaBonificacao());
		System.out.println(funcionarios.get(4) );
	}
}
