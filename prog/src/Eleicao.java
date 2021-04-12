import java.util.Scanner;

public class Eleicao {

	public static void main(String[] args) {
		// Declaracoes
		class Candidato{
			String nome;
			int votos;
			public Candidato(String nome){ this.nome = nome;}
		}
		Candidato candidatos[] = { 
			new Candidato("Candidato 1"),
			new Candidato("Candidato 2"),
			new Candidato("Candidato 3"),
			new Candidato("Candidato 4"),
			new Candidato("Nulo"),
			new Candidato("Em Branco"),
		};

		Scanner scan = new Scanner(System.in);
		int opc = 0, total = 0;

		// Entrada de dados
		while(true) {
			System.out.print("Candidato > ");
			opc = scan.nextInt();
			if (opc == 0) break;
			candidatos[opc-1].votos++;
			total++;
		}

		// Saida de dados
		for (int i=0; i< candidatos.length; i++)
			System.out.println("O " + candidatos[i].nome + " teve " + candidatos[i].votos + " votos");
		System.out.printf("%.2f%% dos votos foram nulos\n", (float)candidatos[4].votos/total*100);
		System.out.printf("%.2f%% dos votos foram em branco\n", (float)candidatos[5].votos/total*100);
		scan.close();
	}// fim main()

}
