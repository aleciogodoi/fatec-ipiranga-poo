
public class FornecedorEmpresa extends Fornecedor{
	private String ie;
	private String cnpj;
	
	public FornecedorEmpresa() {
	}
		
	public FornecedorEmpresa(String nome, String fone, String ie, String cnpj) {
		super(nome, fone);
		this.ie = ie;
		this.cnpj = cnpj;
	}

	
	@Override
	public String toString() {
		return 
			super.toString() + " - FornecedorEmpresa [ie=" + ie + ", cnpj=" + cnpj + "]";
	}

	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
