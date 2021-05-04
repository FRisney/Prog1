package frisney.com.github.projetomotorista;

import frisney.com.github.projetomotorista.modelos.Proprietario;
import frisney.com.github.projetomotorista.modelos.Carro;
import frisney.com.github.projetomotorista.modelos.Endereco;

public class Main {

	public static void main(String[] args) {

		Proprietario prop = new Proprietario("Proprietario 1","12345678901","12345678");

		Endereco end = new Endereco();
		end.setRua("Rua dos Atoleiros");

		prop.setEndereco(end);

		Carro carro = new Carro(prop);

		System.out.println("Velocidade Maxima: " + carro.getVelocidadeMaxima());
		carro.setVelocidadeMaxima(7);
		for (int i = 0; i < 8; i++) {
			carro.acelera();
			carro.trocaMarcha();
			if (i % 2 == 0) {
				carro.acelera();
			}
			System.out.println("Marcha: " + carro.getMarcha());
			System.out.println("Velocidade: " + carro.getVelocidadeAtual());
		}
		for (int i = 0; i < 8; i++) {
			if (carro.getVelocidadeAtual()-1 >= 0)
				carro.setVelocidadeAtual(carro.getVelocidadeAtual() - 1);
			carro.reduzMarcha();
			if (i % 2 != 0 && carro.getVelocidadeAtual()-1 >= 0) {
				carro.setVelocidadeAtual(carro.getVelocidadeAtual() - 1);
			}
			System.out.println("Marcha: " + carro.getMarcha());
			System.out.println("Velocidade: " + carro.getVelocidadeAtual());
		}
		System.out.println(prop.getEndereco().toString());
	}

}
