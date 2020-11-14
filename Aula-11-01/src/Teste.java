import java.sql.Date;
import java.time.LocalDate;

public class Teste {

	public static void main(String[] args) {
		PessoaDAO pessoaDAO = new PessoaDAO();
		/*
		pessoaDAO.insert(new Pessoa(1, "Pedro", 75.21, 1.77, 35, Date.valueOf(LocalDate.of(1985, 1, 27)) ));
		pessoaDAO.insert(new Pessoa(2, "Ana", 60, 1.67, 35, Date.valueOf(LocalDate.of(1985, 10, 27)) ));
		pessoaDAO.insert(new Pessoa(3, "Maria", 55.67, 1.60, 30, Date.valueOf(LocalDate.of(1990, 2, 15)) ));
		pessoaDAO.insert(new Pessoa(4, "João", 80.43, 1.79, 20, Date.valueOf(LocalDate.of(2000, 9, 23)) ));
		pessoaDAO.insert(new Pessoa(5, "Carla", 58.77, 1.55, 15, Date.valueOf(LocalDate.of(2005, 7, 18)) ));
		*/
		
		for (Pessoa pessoa: pessoaDAO.select()) {
			System.out.println(pessoa);
		}
		
		System.out.println("\nPesquisa idPessoa = 3 --> " + pessoaDAO.select(3));
		
	}

}
