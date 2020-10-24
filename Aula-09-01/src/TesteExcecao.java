import javax.swing.JOptionPane;
public class TesteExcecao {
	public static void main(String[] args) {
		int n1, n2;
		boolean excecao;
		do {
			excecao = false;
			try {
				n1 = Integer.valueOf(JOptionPane.showInputDialog("Entre com o 1o. número"));
				n2 = Integer.valueOf(JOptionPane.showInputDialog("Entre com o 2o. número"));
				JOptionPane.showMessageDialog(null,""+n1 + " / " + n2 + " = "+ (n1/n2));		
			} catch(NumberFormatException e) {
				//e.printStackTrace();
				JOptionPane.showMessageDialog(null,"Digite somente números válidos!!!");
				excecao = true;
			} catch(ArithmeticException e) {
				JOptionPane.showMessageDialog(null,"Divisão por ZERO!!!");
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
