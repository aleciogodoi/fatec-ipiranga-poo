import javax.swing.JOptionPane;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f01 = new Funcionario("Antonio", "21212121", 3457.21);
		JOptionPane.showMessageDialog(null, f01);

		Gerente g01 = new Gerente("Claudia", "6645542", 12768.56);
		JOptionPane.showMessageDialog(null, g01);
		
		int senha;
		boolean autentica;
		int tentativas = 1;
		do {
			senha = Integer.valueOf(JOptionPane.showInputDialog(
					"Senha ["+g01.getNome()+"] - Tentativa "+tentativas));
			autentica = g01.autentica(senha);
			
			tentativas++;
			if (autentica) {
				JOptionPane.showMessageDialog(null, "Senha Ok");
			} else {
				JOptionPane.showMessageDialog(null, "Senha Incorreta!!!");
				if (tentativas > 3) {
					JOptionPane.showMessageDialog(null, "Tentativas esgotas!!!");
				}
			}
			
		} while(!autentica && tentativas < 4);
	}

}
