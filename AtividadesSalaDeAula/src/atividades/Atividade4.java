package atividades;

import javax.swing.JOptionPane;

public class Atividade4 {
		public static String funcionario;
		public static String cargo;
		public static float salario;
		public static double salarioTotal;
		
		
	public static void main(String[] args) {
		
		for (int i = 0; i < 3 ; i++) {
			funcionario = JOptionPane.showInputDialog("Informe seu nome completo");
			cargo = JOptionPane.showInputDialog("Informe seu cargo");
			salario = Float.parseFloat(JOptionPane.showInputDialog("Informe seu sal?rio"));
			
			if(salario <= 1500) {
				salarioTotal = salario + 75;
			}else if(salario <= 2.100) {
				salarioTotal = salario + 130.2;
			}else{
				salarioTotal = salario + 150;
			}
			
			JOptionPane.showMessageDialog(null, "Nome: " + funcionario + " Cargo: " + cargo + " Sal?rio : " + salarioTotal);
		
		}
		
		
		
	
	}

}
