package frisney.com.github.projetorh.modelos;

public class Funcionario {
	private String nome;
	private String matricula;
	private String cargo;
	private Float  salario;

	/**
	 * @param nome
	 * @param matricula
	 * @param cargo
	 * @param salario
	 */
	public Funcionario(String nome, String matricula, String cargo, Float salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.cargo = cargo;
		this.salario = salario;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		if (!nome.isBlank() || nome.length() > 4)
			this.nome = nome;
		else
			System.out.println("Nome Invalido");
	}
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}
	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	/**
	 * @return the salario
	 */
	public Float getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(Float salario) {
		this.salario = salario;
	}
}
