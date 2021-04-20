package frisney.com.github.projetobanco.classes;

public class ContaPf extends Conta {
	
	private String	cpf;

	public ContaPf(String id, String nome, Integer saldo, String cpf) {
		super(id,nome,saldo);
		this.setCpf(cpf);
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(super.toString());
		str.append("CPF: " + this.cpf + "\n");
		return str.toString();
	}

}
