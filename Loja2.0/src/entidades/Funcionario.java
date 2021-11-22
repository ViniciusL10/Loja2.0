package entidades;

public class Funcionario {
	private String nome;
	private String documento;
	private Integer cadastro;
	
	public Funcionario(String nome, String documento, Integer cadastro) {
		this.nome = nome;
		this.documento = documento;
		this.cadastro = cadastro;
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
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", documento=" + documento + ", cadastro=" + cadastro + "]";
	}
	
	
}
