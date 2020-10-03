public class Cliente extends Pessoa {
	private int codigo;

	public Cliente(int codigo, String nome, Data nascimento ) {
		super(nome, nascimento);
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + "," + super.toString() + "]";
	}
	
}
