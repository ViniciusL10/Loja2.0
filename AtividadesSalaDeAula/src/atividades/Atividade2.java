package atividades;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		String nome = "";
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe seu nome completo : " );
		nome = s.nextLine().toUpperCase();
		
		System.out.println(nome);
		
	}

}
