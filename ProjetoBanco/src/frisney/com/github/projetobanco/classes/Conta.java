package frisney.com.github.projetobanco.classes;

public class Conta {
	public boolean log;
	protected String  id;
	protected String  nome;
	/*
	 * Saldo em centavos
	 */
	private Integer saldo;
	/**
	 * @param id
	 * @param nome
	 * @param saldo
	 */
	public Conta(String id, String nome, Integer saldo) {
		this.log = true;
		this.id = id;
		this.nome = nome;
		this.saldo = saldo;
	}
	/**
	 * @param id
	 * @param nome
	 * @param saldo
	 */
	public Conta(String id, String nome, float saldo) {
		this.log = true;
		this.id = id;
		this.nome = nome;
		this.saldo = (int)saldo*100;
	}

	public void extrato() {
		System.out.printf("Na conta %s ha R$%.2f\n", id, (float)saldo/100f);
	}

	public boolean depositar(float reais) {
		this.saldo += (int) reais*100;
		if (log)
			System.out.printf("Deposito de R$%.2f efetuado com sucesso!\n", reais);
		return true;
	}

	public boolean sacar(float reais) {
		int novo_saldo = this.saldo - (int) reais*100;
		if (novo_saldo < 0) { 
			if (log)
				System.out.println("Sem saldo");
		 } else {
			if (log)
				System.out.println("Saque efetuado com sucesso!");
			this.saldo = novo_saldo;
		}
		extrato();
		return true;
	}

	public boolean transferirPara(float reais, Conta destino) {
		log = false;
		if (this.id == destino.id) { 
			System.out.println("Nao e possivel transferir para a sua propria conta!");
			return false;
		}
		if (!sacar(reais)) { 
			System.out.println("Sem saldo, transferencia nao efetuada");
			log = true;
			return false;
		}
		destino.log = false;
		destino.depositar(reais);
		destino.log = true;
		log = true;
		System.out.printf("Transferencia de R$%.2f efetuada com sucesso!\n", reais);
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Conta " + this.id + "\n");
		str.append("Nome " + this.nome + "\n");
		str.append("Saldo " + this.saldo/100 + "\n");
		return str.toString();
	}
	
}
