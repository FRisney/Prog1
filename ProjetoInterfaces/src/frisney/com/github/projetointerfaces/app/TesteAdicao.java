package frisney.com.github.projetointerfaces.app;

import frisney.com.github.projetointerfaces.classes.Adicao;
import frisney.com.github.projetointerfaces.classes.Divisao;
import frisney.com.github.projetointerfaces.classes.Multiplicacao;
import frisney.com.github.projetointerfaces.classes.Subtracao;

public class TesteAdicao {
    public static void main(String[] args) {
        Subtracao sub = new Subtracao();
        Multiplicacao mul = new Multiplicacao();
        Divisao div = new Divisao();
        Adicao adc = new Adicao();
        System.out.println(adc.calcular(10f,10f));
        System.out.println(sub.calcular(10f,10f));
        System.out.println(mul.calcular(10f,10f));
        System.out.println(div.calcular(10f,10f));
    }
}
