package frisney.com.github.projetointerfaces.app;

import frisney.com.github.projetointerfaces.classes.Multiplicacao;

public class TesteMultiplicacao {
    public static void main(String[] args) {
        Multiplicacao mul = new Multiplicacao();
        System.out.println(mul.calcular(10f,10f));
    }
}
