package frisney.com.github.projetobanco.programa;

import java.util.Scanner;

import frisney.com.github.projetobanco.classes.Conta;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Conta contas[] = {
				new Conta("001", "Carinha", 10.0f),
				new Conta("002", "Maluco",  10.0f)
		};
		
		do {
			float vlr = 0f;
			System.out.print("digite a conta ");
			int cnt = scan.nextInt() - 1;
			if (cnt < 0 || cnt > contas.length)
				break;
			System.out.print("digite a operacao ");
			var opc = scan.nextInt();
			if (opc == 2 || opc == 3 || opc == 4) {
				System.out.print("digite o valor ");
				vlr = scan.nextFloat();
			}
			switch(opc) { 
				case 1:
					contas[cnt].extrato();
					break;
				case 2:
					contas[cnt].depositar(vlr);
					break;
				case 3:
					contas[cnt].sacar(vlr);
					break;
				case 4:
					System.out.print("digite a conta destino ");
					var dstn = scan.nextInt() - 1;
					if (dstn < 0 || dstn > contas.length)
						System.out.println("Conta destino invalida");
					else
						contas[cnt].transferirPara(vlr, contas[dstn]);
					break;
				default:
					System.out.println("Operacao Invalida");
			}
		}while(true);
		System.out.println("Fim");
		scan.close();

	}

}
