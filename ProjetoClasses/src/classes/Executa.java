package classes;

import java.util.Scanner;

public class Executa {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = s.nextLine();
		
		System.out.println("Informe seu m�dia: ");
		double media = s.nextDouble();
		
		Aluno aluno = new Aluno(nome, media);
		System.out.println("O conceito do aluno � : ".concat(aluno.verificarConceito()));
		
	}
}
