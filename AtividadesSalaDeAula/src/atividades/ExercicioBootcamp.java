package atividades;

import java.util.Scanner;

public class ExercicioBootcamp {
	public static void main(String[] args) {
		int escolha, contador, limite, result;
		
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.println("Informe a tabuada que voc� deseja: ");
		escolha = s.nextInt();
		
		contador = 0;
		limite = 10;
		
		do{
			result = escolha * contador;
			System.out.println(escolha + " x " + contador + " = " + result);
			contador++;
		}while(contador <= limite);
	}
}
