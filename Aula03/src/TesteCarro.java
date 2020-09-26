public class TesteCarro {
	public static void main(String[] args) {
		Carro carroDaVovo = new Carro();
		Carro carroDoPai = new Carro();
		Carro carroDoFilho = new Carro();
		
		carroDaVovo.anoFabricacao = 1975;
		carroDaVovo.cor = "branca";
		carroDaVovo.marca = "Fiat";
		carroDaVovo.modelo = "147";
		carroDaVovo.imprimirDados();
		
		carroDoPai.anoFabricacao = 1980;
		carroDoPai.cor = "vermelho";
		carroDoPai.marca = "Miura";
		carroDoPai.modelo = "GTX";
		carroDoPai.imprimirDados();
		
		carroDoFilho.anoFabricacao = 2018;
		carroDoFilho.cor = "prata";
		carroDoFilho.marca = "VW";
		carroDoFilho.modelo = "Golf";
		carroDoFilho.imprimirDados();
		
	}
}
