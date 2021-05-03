package frisney.com.github.projetomotorista.modelos;

public class Carro {
	private Integer ano;
	private String  cambioAutomatico;
	private String  chassi;
	private String  cor;
	private String  marca;
	private String  marchas;
	private String  modelo;
	private Integer numeroPortas;
	private Proprietario  proprietario;
	private Boolean tetoSolar;
	private Integer velocidadeAtual;
	private Integer velocidadeMaxima;
	private String  volumeCombustivel;
	
	// Getters and Setters

	public Integer getAno() { return ano; }
	public void setAno(Integer ano) { this.ano = ano; }

	public String getCambioAutomático() { return cambioAutomatico; }
	public void setCambioAutomático(String cambioAutomatico) { this.cambioAutomatico = cambioAutomatico; }

	public String getChassi() { return chassi; }
	public void setChassi(String chassi) { this.chassi = chassi; }

	public String getCor() { return cor; }
	public void setCor(String cor) { this.cor = cor; }

	public String getMarca() { return marca; }
	public void setMarca(String marca) { this.marca = marca; }

	public String getMarchas() { return marchas; }
	public void setMarchas(String marchas) { this.marchas = marchas; }

	public String getModelo() { return modelo; }
	public void setModelo(String modelo) { this.modelo = modelo; }

	public Integer getNumeroPortas() { return numeroPortas; }
	public void setNumeroPortas(Integer numeroPortas) { this.numeroPortas = numeroPortas; }

	public Proprietario getProprietario() { return proprietario; }
	public void setProprietario(Proprietario proprietario) { this.proprietario = proprietario; }

	public Boolean getTetoSolar() { return tetoSolar; }
	public void setTetoSolar(Boolean tetoSolar) { this.tetoSolar = tetoSolar; }

	public Integer getVelocidadeAtual() { return velocidadeAtual; }
	public void setVelocidadeAtual(Integer velocidadeAtual) { this.velocidadeAtual = velocidadeAtual; }

	public Integer getVelocidadeMaxima() { return velocidadeMaxima; }
	public void setVelocidadeMaxima(Integer velocidadeMaxima) { this.velocidadeMaxima = velocidadeMaxima; }

	public String getVolumeCombustivel() { return volumeCombustivel; }
	public void setVolumeCombustivel(String volumeCombustivel) { this.volumeCombustivel = volumeCombustivel; }

}
