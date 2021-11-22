package escola;

public class Aluno extends Pessoa{
	private int matricula;
	
	public Aluno(int matricula, String nome) {
		super(nome);
		this.matricula = matricula;
		
	}// metodo construtor
	
	public String toString() {
		return "Matricula: " + matricula + " Nome: " + getNome();
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
}
