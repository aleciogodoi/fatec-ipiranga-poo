public class Carro {
	// Atributos
	String marca;
	String modelo;
	String cor;
	int anoFabricacao;
	
	public void imprimirDados() {
		System.out.println("["
				+" Marca: "+marca
				+" Modelo: "+modelo
				+" Cor: "+cor
				+" Ano Fabricação: "+anoFabricacao
				+ "]");
	}
}
