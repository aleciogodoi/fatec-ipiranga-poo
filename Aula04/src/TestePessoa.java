public class TestePessoa {
	public static void main(String[] args) {
		Pessoa p01 = new Pessoa();
		/*
		 Com atributos publicos
		p01.nome = "Alex";
		p01.CPF = "21217654309";
		p01.altura = 1.85f;
		p01.peso = 82.78f;
		System.out.println("Nome: "+p01.nome);
		*/
		
		// Com o encapsulamento (atributos privados)
		p01.setNome("Alex");
		p01.setCPF("21217654309");
		p01.setAltura(1.85f);
		p01.setPeso(82.78f);
		System.out.println("Nome: "+p01.getNome());
		
	}
}
