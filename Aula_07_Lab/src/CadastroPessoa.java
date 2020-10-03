import java.util.ArrayList;

public class CadastroPessoa {
	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void cadastrPessoa(Pessoa p) {
		pessoas.add(p);
	}
	
	public int getQtdPessoas() {
		return pessoas.size();
	}
	
	public void imprimeCadastro() {
		System.out.println("Total de Pessoas: "+Pessoa.getTotal());
		System.out.println("Total de Cliente: "+Cliente.getTotal());
		System.out.println("Total de Funcionario: "+Funcionario.getTotal());
		System.out.println("Total de Gerente: "+Gerente.getTotal());
		for (Pessoa pessoa : pessoas) {
			pessoa.ImprimeDados();
		}
	}
}
