import java.util.ArrayList;

public class TesteVeiculo {
	public static void main(String[] args) {
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
		veiculos.add(new Veiculo("XPO-0987",2010));
		veiculos.add(new Veiculo("ABC-1234",2012));
		veiculos.add(new Veiculo("KYX-0987",2014));
		veiculos.add(new Caminhao("NZT-3028",2014,5));
		veiculos.add(new Caminhao("HJU-3341",2000,7));
		veiculos.add(new Onibus("KKK-3467",1988,50));
		veiculos.add(new Onibus("CCC-1111",2001,55));
		
		for(Veiculo veiculo: veiculos) {
			veiculo.exibirDados();
			System.out.println(veiculo);
		}
		
		//Casting de objetos
		
		// Casting de veiculo "caminhão" para caminhão funciona
		Veiculo v = new Caminhao("NZT-3028",2014,5);
		Caminhao c = (Caminhao) v;
		
		// Casting de veiculo "puro" para caminhão não funciona
		Veiculo v2 = new Veiculo("XPO-0987",2010);
		Caminhao c2 = (Caminhao)v2;	
		//System.out.println(c2.toString());
		
	}
}
