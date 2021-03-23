import java.util.Scanner;

public class Eleicao {

	public static void main(String[] args) {
		// Declaracoes
		class Candidato{
			String nome;
			int votos;
			public Candidato(String nome){ this.nome = nome;}
		}
		Scanner scan = new Scanner(System.in);
		int opc = 0;
		int total = 0;
		Candidato candidatos[] = new Candidato[6];
		
		// Nomes dos candidatos
		candidatos[0] = new Candidato("Candidato 1");
		candidatos[1] = new Candidato("Candidato 2");
		candidatos[2] = new Candidato("Candidato 3");
		candidatos[3] = new Candidato("Candidato 4");
		candidatos[4] = new Candidato("Nulo");
		candidatos[5] = new Candidato("Em Branco");
		
		// Entrada de dados
		while(true) {
			System.out.print("Candidato > ");
			opc = scan.nextInt();
			if (opc != 0) { 
				candidatos[opc-1].votos++;
				total++;
			}
			else
				break;
		}
		
		// Saida de dados
		for (int i=0; i< candidatos.length; i++) {
			System.out.println("O " + candidatos[i].nome + " teve " + candidatos[i].votos + " votos");
		}
		System.out.printf("%.2f%% dos votos foram nulos\n", (float)candidatos[4].votos/total*100);
		System.out.printf("%.2f%% dos votos foram em branco\n", (float)candidatos[5].votos/total*100);
		scan.close();
	}// fim main()

}
