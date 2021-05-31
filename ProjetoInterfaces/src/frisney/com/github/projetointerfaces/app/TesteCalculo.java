package frisney.com.github.projetointerfaces.app;

import frisney.com.github.projetointerfaces.classes.Adicao;
import frisney.com.github.projetointerfaces.classes.CalculaInterface;
import frisney.com.github.projetointerfaces.classes.Subtracao;

public class TesteCalculo {
    public static void main(String[] args) {
        CalculaInterface calculo = new Subtracao();
        System.out.println(calculo.calcular(10f,5f));
    }
}
