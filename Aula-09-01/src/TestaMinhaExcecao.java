public class TestaMinhaExcecao {

	public static void main (String args[]) throws IdadeInsuficienteException {

	  try {
	   // CarteiraDeMotorista c1 = new CarteiraDeMotorista ("Vladimir Camelo", 38);
		CarteiraDeMotorista c2 = new CarteiraDeMotorista ("Ana Clara Camelo", 4);
	  }
	  catch (IdadeInsuficienteException i) {
		i.printStackTrace();
	 	//System.out.println(i.getMessage());
	  }
	}	
}
