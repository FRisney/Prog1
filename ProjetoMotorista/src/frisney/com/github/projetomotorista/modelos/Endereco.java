package frisney.com.github.projetomotorista.modelos;

public class Endereco {
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String complemento;
	
	public Endereco() {
		this.rua = "";
		this.bairro = "";
		this.cidade = "";
		this.estado = "";
		this.cep = "";
		this.complemento = "";
	}

	@Override
	public String toString() {
		return "Endereco: " + rua + ", " + bairro + ", " + cidade + " - " + estado + ", "
				+ cep + ", " + complemento;
	}

	// Getters and Setters
	
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
