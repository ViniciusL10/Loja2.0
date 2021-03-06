package servicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entidades.Cliente;
import entidadesenum.TipoCliente;

public class CadastroCliente {
	private List<Cliente> listaClientes = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	public void adicionar() {
		Random gerador = new Random();
		int cadastro = gerador.nextInt(10000);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o tipo de pessoa: 1-Pessoa F?sica 2-Pessoa Jur?dica 3-Pessoa Estrangeira");
		int tipoPessoa = scanner.nextInt();
			
		System.out.println("Digite seu documento: ");
		String documento = scanner.next();
		
		Cliente cliente = new Cliente(nome, documento, cadastro, tipoPessoa);
		System.out.println("Dados do cliente: " + cliente);
		if(listaClientes.contains(cliente)) {
			System.out.println("Ops... Cliente ja cadastrado"); 	
		}else {
			listaClientes.add(cliente);
			System.out.println("Cliente cadastrado com Sucesso");
		}
	}
}

