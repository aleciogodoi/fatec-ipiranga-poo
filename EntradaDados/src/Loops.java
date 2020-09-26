
public class Loops {
	public static void main(String[] args) {
		String s ="*";
		int i;
		for(i=1; i <= 10 ; i++) {
			System.out.println("i = "+i+" "+ s);
			s += "*";
		}
		System.out.println("i = "+i);

		s = "-";
		i = 1;
		while (i <= 10) {
			System.out.println("i = "+i+" "+ s);
			s += "-";	
			i++;
		}
		
		s = "^";
		i = 1;
		do {
			System.out.println("i = "+i+" "+ s);
			s += "^";		
			i++;
		} while (i <= 10);
	}
}
