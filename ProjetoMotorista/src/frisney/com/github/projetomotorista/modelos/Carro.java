package frisney.com.github.projetomotorista.modelos;

public class Carro {
	private Integer ano;
	private String  cambioAutomatico;
	private String  chassi;
	private String  cor;
	private String  marca;
	private Integer marchas;
	private String  modelo;
	private Integer numeroPortas;
	private Proprietario  proprietario;
	private Boolean tetoSolar;
	private Integer velocidadeAtual;
	private Integer velocidadeMaxima;
	private Integer volumeCombustivel;
	private Integer marcha;

	public Carro(Proprietario prop) {
		this.proprietario = prop;
		this.ano = 0;
		this.velocidadeMaxima = 100;
		this.velocidadeAtual = 0;
		this.volumeCombustivel = 0;
		this.marcha = 0;
		this.marchas = 6;
		this.numeroPortas = 2;
		this.chassi = "0";
		this.modelo = "0";
		this.cor = "0";
		this.marca = "0";
		this.cambioAutomatico = "N";
		this.tetoSolar = false;
	}

	public void acelera() {
		if (this.velocidadeAtual + 1 <= this.velocidadeMaxima)
			this.velocidadeAtual += 1;
	}

	public void freia() {
		this.velocidadeAtual = 0;
	}

	public void trocaMarcha() {
		if (this.marcha + 1 <= this.marchas)
			this.marcha += 1;
	}

	public void reduzMarcha() {
		if ((this.marcha == 1 && this.velocidadeAtual == 0) || this.marcha - 1 >= 1)
			this.marcha -= 1;
	}

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

	public Integer getMarchas() { return marchas; }
	public void setMarchas(Integer marchas) { this.marchas = marchas; }

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

	public Integer getVolumeCombustivel() { return volumeCombustivel; }
	public void setVolumeCombustivel(Integer volumeCombustivel) { this.volumeCombustivel = volumeCombustivel; }

	public Integer getMarcha() { return marcha; }
	public void setMarcha(Integer marcha) { this.marcha = marcha; }

}
