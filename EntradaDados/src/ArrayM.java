public class ArrayM {
	public static void main(String[] args) {
		int[][] numeros = { {1, 2, 3}, 
				            {4, 5, 7},
				            {6, 8, 11} 
						  };
		
		for(int linha=0; linha < numeros.length; linha++) {
			for(int coluna=0; coluna < numeros[linha].length; coluna++) {
				System.out.print(numeros[linha][coluna]+"\t");
			}
			System.out.println();
		}
		
		String[][] cadastros = new String[3][3];
		cadastros[0][0] = "Otavio";
		cadastros[0][1] = "otavio@gmail.com";
		cadastros[0][2] = "01/01/1980";
		
		cadastros[1][0] = "Paula";
		cadastros[1][1] = "paula@gmail.com";
		cadastros[1][2] = "25/12/1990";
		
		cadastros[2][0] = "Alberto";
		cadastros[2][1] = "alberto@gmail.com";
		cadastros[2][2] = "31/01/1976";
		
		System.out.println("\n"+cadastros+"\n\n");
		for(int linha=0; linha < cadastros.length; linha++) {
			for(int coluna=0; coluna < cadastros[linha].length; coluna++) {
				System.out.print(cadastros[linha][coluna]+"\t\t\t");
			}
			System.out.println();
		}
	}
}
