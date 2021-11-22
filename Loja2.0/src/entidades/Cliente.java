package entidades;

import java.util.Objects;

import entidadesenum.TipoCliente;

public class Cliente {
	private String nome;
	private String documento;
	private Integer cadastro;
	
	private TipoCliente tipoCliente;
	
	
	public Cliente() {
	
	}

	public Cliente(String nome, String documento, Integer cadastro, Integer tipoClienteValor) {
		this.nome = nome;
		this.documento = documento;
		this.cadastro = cadastro;
		this.tipoCliente = TipoCliente.converterEnum(tipoClienteValor);
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(documento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(documento, other.documento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Integer getCadastro() {
		return cadastro;
	}

	public void setCadastro(Integer cadastro) {
		this.cadastro = cadastro;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	@Override
	public String toString() {
		return "CLIENTE N°: " + cadastro + "\n NOME: " + nome + "\n DOCUMENTO : "
				+ documento + "\n Tipo Cliente :" + tipoCliente.getDescricao();
	} 
	
}
