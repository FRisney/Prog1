package frisney.com.github.projetobanco.classes;

public class ContaPj extends Conta {
	
	private String	cnpj;

	public ContaPj(String id, String nome, Integer saldo, String cnpj) {
		super(id,nome,saldo);
		this.setCnpj(cnpj);
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(super.toString());
		str.append("CNPJ: " + this.cnpj + "\n");
		return str.toString();
	}

}
