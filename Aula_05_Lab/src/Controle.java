import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Controle {

	static DespesaPessoal despesas;
	static int dia, mes, ano;
	static String itemDespesa;
	static double valor;
	static String cpf;
	
	public static void main(String[] args) {
		cpf = JOptionPane.showInputDialog("CPF: ");
		despesas = new DespesaPessoal(cpf);
		cargaInicial();
		controleDespesas();
	}

	public static void controleDespesas(){
		String opcao = "";
		do {
			opcao = JOptionPane.showInputDialog(
					  "1 - Lançamento de despesa\n"
					+ "2 - Total geral de despesas\n"
					+ "3 - Total de despesas mês/ano\n"
					+ "4 - Total de despesas dia/mês/ano\n"
					+ "5 - Imprimir todas as despesas\n"
					+ "6 - Imprimir depesas de um mês/ano\n"
					+ "7 - Imprimir depesas de um dia/mês/ano\n"
					+ "8 - Sair"
			);
			switch (opcao) {
			case "1":
				entradaDespesa();
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "Total de Despesas: "+despesas.getTotal());
				break;
			case "3":
				entradaMes();
				entradaAno();
				JOptionPane.showMessageDialog(null, "Total de Despesas "+mes+"/"+ ano +
						" = "+despesas.getTotal(mes, ano));
				break;
			case "4":
				entradaDia();
				entradaMes();
				entradaAno();
				JOptionPane.showMessageDialog(null, "Total de Despesas "+dia+"/"+mes+"/"+ ano +
						" = "+despesas.getTotal(LocalDate.of(ano, mes, dia)));
				break;
			case "5":
				despesas.imprime();
				break;
			case "6":
				entradaMes();
				entradaAno();
				despesas.imprime(mes, ano);
				break;
			case "7":
				entradaDia();
				entradaMes();
				entradaAno();
				despesas.imprime(LocalDate.of(ano, mes, dia));
				break;
			}
		} while(!opcao.equals("8"));
	}
	
	public static void entradaDespesa() {
		itemDespesa = JOptionPane.showInputDialog("Despesa: ");
		entradaDia();
		entradaMes();
		entradaAno();
		valor = Double.valueOf(JOptionPane.showInputDialog("Valor: "));
		despesas.despesas.add(new Despesa(LocalDate.of(ano, mes, dia),itemDespesa, valor));
	}

	public static void entradaDia() {
		dia = Integer.valueOf(JOptionPane.showInputDialog("Dia: "));
	}
	public static void entradaMes() {
		mes = Integer.valueOf(JOptionPane.showInputDialog("Mês: "));
	}
	public static void entradaAno() {
		ano = Integer.valueOf(JOptionPane.showInputDialog("Ano: "));
	}
	
	public static void cargaInicial() {
		despesas.despesas.add(new Despesa(LocalDate.of(2020,1,1),"Mercado",10.89));
		despesas.despesas.add(new Despesa(LocalDate.of(2020,2,27),"Luz",50.77));
		despesas.despesas.add(new Despesa(LocalDate.of(2020,1,1),"Farmarcia",22.77));
		despesas.despesas.add(new Despesa(LocalDate.of(2020,1,1),"Feira",15.50));
		despesas.despesas.add(new Despesa(LocalDate.of(2020,1,2),"Gas",30.55));
		despesas.despesas.add(new Despesa(LocalDate.of(2020,1,4),"Luz",80.33));
		despesas.despesas.add(new Despesa(LocalDate.of(2020,1,5),"Internet",74.12));
		despesas.despesas.add(new Despesa(LocalDate.of(2020,2,1),"Mercado",100.22));
		despesas.despesas.add(new Despesa(LocalDate.of(2020,2,1),"Farmarcia",42.21));
		despesas.despesas.add(new Despesa(LocalDate.of(2020,2,1),"Feira",30.15));
		despesas.despesas.add(new Despesa(LocalDate.of(2020,2,2),"Gas",20.17));
		despesas.despesas.add(new Despesa(LocalDate.of(2020,2,4),"Luz",67.31));
		despesas.despesas.add(new Despesa(LocalDate.of(2020,2,5),"Internet",55.43));
		
	}
}
