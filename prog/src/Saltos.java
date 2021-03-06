import java.util.Scanner;

public class Saltos {

	public static void main(String[] args) {
		// declaracoes
		Scanner scan = new Scanner(System.in);
		System.out.print("Nome do atleta: ");
		String nome = scan.nextLine();
		float distancias[] = new float[5];
		float media = 0f;
		
		if (nome.length() == 0) {
			System.out.println("Atleta sem nome, programa terminado.");
			scan.close();
			return;
		}
		
		// entrada de dados
		for (int i=0; i<distancias.length; i++) {
			System.out.print("Salto " + (i+1) + ": ");
			distancias[i] = scan.nextFloat();
			media += distancias[i];
		}
		media /= distancias.length;

		// Saida de dados
		System.out.println("Atleta: " + nome);
		for (int i=0; i<distancias.length; i++) {
			String out = "";
			if (i==0)  out = "Saltos: "; 
			out += distancias[i];
			if(i!=distancias.length-1) out += " - ";
			else out += "\n";
			System.out.print(out);
		}
		System.out.println("Media dos Saltos: " + media);

		scan.close();
	}

}
