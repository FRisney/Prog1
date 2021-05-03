package frisney.com.github.projetobanco.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import frisney.com.github.projetobanco.classes.Conta;
import frisney.com.github.projetobanco.classes.ContaPf;
import frisney.com.github.projetobanco.classes.ContaPj;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Conta> contas = new ArrayList<Conta>();

		criaConta(scan,contas);

		do {
			float vlr = 0f;
			System.out.print("digite a conta ");
			int cnt = scan.nextInt() - 1;
			if (cnt < 0 || cnt >= contas.size()) {
				System.out.println("Nao ha uma conta " + (cnt+1));
				break;
			}
			System.out.print("digite a operacao ");
			var opc = scan.nextInt();
			if (opc == 2 || opc == 3 || opc == 4) {
				System.out.print("digite o valor ");
				vlr = scan.nextFloat();
			}
			switch(opc) {
				case 1:
					contas.get(cnt).extrato();
					break;
				case 2:
					contas.get(cnt).depositar(vlr);
					break;
				case 3:
					contas.get(cnt).sacar(vlr);
					break;
				case 4:
					System.out.print("digite a conta destino ");
					var dstn = scan.nextInt() - 1;
					if (dstn < 0 || dstn > contas.size())
						System.out.println("Conta destino invalida");
					else
						contas.get(cnt).transferirPara(vlr, contas.get(cnt));
					break;
				case 5:
					criaConta(scan,contas);
					break;
				default:
					System.out.println("Operacao Invalida");
			}
		}while(true);
		System.out.println("Fim");
		scan.close();

	}

	private static void criaConta(Scanner scan, List<Conta> contas) {
		System.out.print("ID: ");
		var id = scan.next();
		System.out.print("Nome: ");
		var nome = scan.next();
		System.out.print("Saldo: R$");
		Integer saldo = (int) (scan.nextFloat() * 100);
		System.out.print("Tipo (J/F): ");
		char opc = scan.next().charAt(0);
		switch (opc) {
			case 'F':
				System.out.print("CPF: ");
				String cpf = scan.next();
				contas.add(new ContaPf(id, nome, saldo, cpf));
				break;
			case 'J':
				System.out.print("CNPJ: ");
				String cnpj = scan.next();
				contas.add(new ContaPj(id, nome, saldo, cnpj));
				break;
			default:
				throw new IllegalArgumentException("Tipo invalido: " + opc);
		}
	}

}
