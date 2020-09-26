
public class Aluno {
	private String nome;
	private String matricula;
	private double nota1;
	private double nota2;
	private double notaReavaliacao;
	
	Aluno() {
	}
		
	public Aluno(String nome, String matricula, 
				 double nota1, double nota2,
				 double notaReavaliacao) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaReavaliacao = notaReavaliacao;
	}
	
	public double calculaMedia(){
		return (this.nota1 + this.nota2) / 2;
	}
	
	public double calculaMediaFinal(){
		if (calculaMedia() >= 6) {
			return calculaMedia();
		} else {
			return ( calculaMedia() + this.notaReavaliacao ) / 2 ;
		}
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota1=" + nota1 + ", nota2=" + nota2
				+ ", notaReavaliacao=" + notaReavaliacao + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNotaReavaliacao() {
		return notaReavaliacao;
	}
	public void setNotaReavaliacao(double notaReavaliacao) {
		this.notaReavaliacao = notaReavaliacao;
	}

}
