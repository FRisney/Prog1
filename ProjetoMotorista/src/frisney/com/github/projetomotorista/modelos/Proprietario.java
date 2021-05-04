package frisney.com.github.projetomotorista.modelos;

public class Proprietario {
	private String nome;
	private String cpf;
	private String rg;
	private String nascimento;
	private Endereco endereco;
	
	public Proprietario(String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	// Getters and Setters

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public String getCpf() { return cpf; }
	public void setCpf(String cpf) { this.cpf = cpf; }
	
	public String getRg() { return rg; }
	public void setRg(String rg) { this.rg = rg; }
	
	public String getNascimento() { return nascimento; }
	public void setNascimento(String nascimento) { this.nascimento = nascimento; }

	public Endereco getEndereco() { return endereco; }
	public void setEndereco(Endereco endereco) { this.endereco = endereco; }
}
