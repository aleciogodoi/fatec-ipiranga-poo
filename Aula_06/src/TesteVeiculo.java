import java.util.ArrayList;

public class TesteVeiculo {

	public static void main(String[] args) {
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
		veiculos.add(new Veiculo("XPO-0987",2010));
		veiculos.add(new Veiculo("ABC-1234",2012));
		veiculos.add(new Veiculo("KYX-0987",2014));
		
		for(Veiculo veiculo: veiculos) {
			veiculo.exibirDados();
		}
	}

}
