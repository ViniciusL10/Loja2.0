package atividade8;

public class Aluno {
	private String nome;
	private static double media;
	
	
	
	public Aluno(String nome, double media) {
		super();
		this.nome = nome;
		Aluno.media = media;
	}

	public String toString() {
		return "Nome do Aluno: " + nome + "M?dia do Aluno: " + media;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static double getMedia() {
		return media;
	}

	public static void setMedia(double media) {
		Aluno.media = media;
	}

	static void verificarConceito() {
		if(media >= 9) {
			System.out.println("A");
		}else if(media > 8 && media == 8.9) {
			System.out.println("B");
		}else if(media > 6 && media == 7.9) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
	}
	
	
}
