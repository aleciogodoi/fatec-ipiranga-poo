public class Teste {
	public static void main(String[] args) {
		//Fornecedor
		Fornecedor f01 = new Fornecedor("Pedro","(11) 99999-0987");
		
		//FornecedorPessoa
		FornecedorPessoa fp01 = new FornecedorPessoa("Maria","(11) 88888-1117","12121","22222");
	
		//FornecedorEmpresa
		FornecedorEmpresa fe01 = new FornecedorEmpresa("Xpto Ltda","(11) 5554-0009","8876543","098745645");
		
		
		System.out.println(f01);
		System.out.println(fp01);
		System.out.println(fe01);
		
	}
}
