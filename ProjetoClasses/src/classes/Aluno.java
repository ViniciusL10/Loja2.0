package classes;

public class Aluno {
	private String nome;
	private double media;
	
	
	public Aluno(String nome, double media) {
		this.nome = nome;
		this.media = media;
	}
	
	public String verificarConceito() {
		String conceito = null;
		
		if(this.getMedia() >= 9) {
			conceito = "A";
		}else if(this.getMedia() >= 8 && this.getMedia() < 9) {
			conceito = "B";
		}else if(this.getMedia() >= 6 && this.getMedia() < 8) {
			conceito = "C";
		}else {
			conceito = "D";
		}
		
		return conceito;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", media=" + media + ", verificarConceito()=" + verificarConceito()
				+ "]";
	}
	
	
	
}
