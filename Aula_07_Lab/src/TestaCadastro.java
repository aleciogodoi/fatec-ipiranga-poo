public class TestaCadastro {
	public static void main(String[] args) {
		CadastroPessoa cadastro = new CadastroPessoa();
		cadastro.pessoas.add(new Pessoa("João", new Data(1,1,1990)));
		cadastro.pessoas.add(new Pessoa("Maria", new Data(15,2,2001)));
		cadastro.pessoas.add(new Pessoa("José", new Data(1,1,1990)));
		cadastro.pessoas.add(new Pessoa("Renata", new Data(15,2,2001)));
		cadastro.pessoas.add(new Cliente(1,"Pedro", new Data(1,1,1990)));
		cadastro.pessoas.add(new Cliente(2,"Joaquina", new Data(15,2,2001)));
		cadastro.pessoas.add(new Cliente(3,"Anderson", new Data(1,1,1990)));
		cadastro.pessoas.add(new Cliente(4,"Ana", new Data(15,2,2001)));
		cadastro.pessoas.add(new Cliente(5,"Carolina", new Data(1,1,1990)));
		cadastro.pessoas.add(new Funcionario("Mauro",new Data(1,1,1990),5231.2f ));
		cadastro.pessoas.add(new Funcionario("Antonio",new Data(2,10,1980),7631.4f ));
		cadastro.pessoas.add(new Funcionario("Pedro",new Data(2,15,1985),2331.6f ));
		cadastro.pessoas.add(new Gerente("Marta",new Data(2,10,1977),12031.5f,"TI" ));
		cadastro.imprimeCadastro();
	}
}
