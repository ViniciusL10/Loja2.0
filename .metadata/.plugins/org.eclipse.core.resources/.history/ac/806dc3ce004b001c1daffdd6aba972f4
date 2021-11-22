package loja;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Cliente {
	private int cadastro;
	private String nome;
	private int idade;
	private String documento;
	Integer[] qtdeParcela = { 1, 2, 3, 4, 5 };
	String[] pagtoCartao = { "À vista", "Prazo" };
	String[] tipoPagto2 = { "Credito", "Debito", "Dinheiro" };
	private String tipoPagto;
	String[] pessoa2 = { "Fisica", "Juridica" };
	private String identificacao;
	private Date dataNascimento;
	private Date pagarProduto;

	public void cadastrarCliente() {
		int opcao = 1;

		while (opcao != 0) {
			int erro = 1;
			try {
				cadastro = +1;
				nome = JOptionPane.showInputDialog("Informe o nome do cliente");
				while (erro == 1) {
					try {
						idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do cliente"));
						erro = 2;
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Formato inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
					}
				}
				int opcao2 = JOptionPane.showOptionDialog(null, "Tipo de pessoa ", "Escolha",
						JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, pessoa2, pessoa2[0]);

				if (opcao2 == 0) {
					identificacao = JOptionPane.showInputDialog("informe o seu cpf");
					documento = "Pessoa Fisica";
				} else if (opcao2 == 1) {
					identificacao = JOptionPane.showInputDialog("Informe o seu cnpj");
					documento = "Pessoa Jurídica";
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Formato inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
			opcao = JOptionPane.showConfirmDialog(null,
					"CLIENTE N°: " + cadastro + "\n NOME: " + nome + "\n IDADE: " + idade + "\n DOCUMENTO : "
							+ documento + "\n CNPJ/CPF :" + identificacao + "\n Confirmar cadastro?");

			if (opcao == 0) {
				JOptionPane.showMessageDialog(null, "Tudo certo! Prosseguindo...");
			}
			if (opcao == 2) {
				JOptionPane.showMessageDialog(null, "Voltando para o Menu...", "Ok!", JOptionPane.PLAIN_MESSAGE);
				opcao = 0;
			}
		}
	}

	public void pagarProduto(Date data) throws ParseException {
		Funcionario fun = new Funcionario();
		String numCartao;
		int erro = 1;
		int vlrParcela;
		int senhaCartao;
		boolean exception = true;
		int opcao = JOptionPane.showOptionDialog(null, "Escolha a forma de pagamento?", "Escolha",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, tipoPagto2, tipoPagto2[0]);

		if (opcao == 0) {
			while (erro == 1) {
				try {
					numCartao = JOptionPane.showInputDialog("Informe o número do cartão");
					String dataRecebida = JOptionPane.showInputDialog("Informe sua data de nascimento");
					SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
					Date dataFormatada = formato.parse(dataRecebida);
					senhaCartao = Integer.parseInt(JOptionPane.showInputDialog("Informe a senha do cartão"));
					erro = 2;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Você inseriu um valor inválido", "ERRO",
							JOptionPane.ERROR_MESSAGE);
				} catch (NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Voltando ao menu", "Cancelar",
							JOptionPane.INFORMATION_MESSAGE);
					exception = false;
				}
			}
			if (exception) {
				JOptionPane.showMessageDialog(null, "Cartão cadastrado com sucesso!!");
			}
		}
		if (opcao == 1) {
			while (erro == 1) {
				try {
					numCartao = JOptionPane.showInputDialog("Informe o número do cartão");
					String dataRecebida = JOptionPane.showInputDialog("Informe sua data de nascimento");
					SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
					Date dataFormatada = formato.parse(dataRecebida);
					senhaCartao = Integer.parseInt(JOptionPane.showInputDialog("Informe a senha do cartão"));
					erro = 2;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Você inseriu um valor inválido", "ERRO",
							JOptionPane.ERROR_MESSAGE);
				} catch (NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Voltando ao menu", "Cancelar",
							JOptionPane.INFORMATION_MESSAGE);
					exception = false;
				}
			}
			if (exception) {
				JOptionPane.showMessageDialog(null, "Cartão cadastrado com sucesso!!");
			}
		}
		if (opcao == 2) {
// Pagamento com dinheiro arrumar
		}

		int opcao2 = JOptionPane.showOptionDialog(null, "À vista ou a prazo? ", "Escolha", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, pagtoCartao, pagtoCartao[0]);

		if (opcao2 == 0) {
		}
		if (opcao2 == 1) {
			int opcao3 = JOptionPane.showOptionDialog(null, "Quantidade de parcela ", "Escolha",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, qtdeParcela, qtdeParcela[0]);

			if (opcao3 == 0) {

			}
			if (opcao3 == 1) {

			}
			if (opcao3 == 2) {

			}

		}

		this.pagarProduto = data;
	}

	private int getCadastro() {
		return cadastro;
	}

	private void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getDocumento() {
		return documento;
	}

	private void setDocumento(String documento) {
		this.documento = documento;
	}

	private String getTipoPagto() {
		return tipoPagto;
	}

	private void setTipoPagto(String tipoPagto) {
		this.tipoPagto = tipoPagto;
	}

}
