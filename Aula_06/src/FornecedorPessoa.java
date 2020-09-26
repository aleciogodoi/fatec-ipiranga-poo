public class FornecedorPessoa extends Fornecedor {
	private String rg;
	private String cpf;
	
	public FornecedorPessoa() {
	}
	
	@Override
	public String toString() {
		return  super.toString() +
				" - FornecedorPessoa [rg=" + rg + ", cpf=" + cpf + "]";
	}

	public FornecedorPessoa(String nome, String fone,String rg, String cpf) {
		super(nome, fone);
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public String getRG() {
		return rg;
	}
	public void setRG(String rg) {
		this.rg = rg;
	}
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cPF) {
		this.cpf = cpf;
	}

	
}
