import javax.swing.JOptionPane;
public class TesteExcecao {
	public static void main(String[] args) {
		int n1, n2;
		boolean excecao;
		do {
			excecao = false;
			try {
				n1 = Integer.valueOf(JOptionPane.showInputDialog("Entre com o 1o. n�mero"));
				n2 = Integer.valueOf(JOptionPane.showInputDialog("Entre com o 2o. n�mero"));
				JOptionPane.showMessageDialog(null,""+n1 + " / " + n2 + " = "+ (n1/n2));		
			} catch(NumberFormatException e) {
				//e.printStackTrace();
				JOptionPane.showMessageDialog(null,"Digite somente n�meros v�lidos!!!");
				excecao = true;
			} catch(ArithmeticException e) {
				JOptionPane.showMessageDialog(null,"Divis�o por ZERO!!!");
				excecao = true;
			} finally {
				if (excecao)
					JOptionPane.showMessageDialog(null,"Xiii!!! Deu Problema!!!");
				else
					JOptionPane.showMessageDialog(null,"Fim do Programa.");
			}
		} while (excecao);
	}
}
