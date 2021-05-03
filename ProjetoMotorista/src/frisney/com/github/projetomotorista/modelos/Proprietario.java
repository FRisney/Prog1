package frisney.com.github.projetomotorista.modelos;

public class Proprietario {
	private String nome;
	private Integer cpf;
	private Integer rg;
	private String nascimento;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String complemento;
	
	public Proprietario(String nome, Integer cpf, Integer rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public Integer getCpf() { return cpf; }
	public void setCpf(Integer cpf) { this.cpf = cpf; }
	
	public Integer getRg() { return rg; }
	public void setRg(Integer rg) { this.rg = rg; }
	
	public String getNascimento() { return nascimento; }
	public void setNascimento(String nascimento) { this.nascimento = nascimento; }
	
	public String getRua() { return rua; }
	public void setRua(String rua) { this.rua = rua; }
	
	public String getBairro() { return bairro; }
	public void setBairro(String bairro) { this.bairro = bairro; }
	
	public String getCidade() { return cidade; }
	public void setCidade(String cidade) { this.cidade = cidade; }
	
	public String getEstado() { return estado; }
	public void setEstado(String estado) { this.estado = estado; }
	
	public String getCep() { return cep; }
	public void setCep(String cep) { this.cep = cep; }

	public String getComplemento() { return complemento; }
	public void setComplemento(String complemento) { this.complemento = complemento; }
}