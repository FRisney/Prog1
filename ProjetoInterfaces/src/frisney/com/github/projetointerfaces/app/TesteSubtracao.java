package frisney.com.github.projetointerfaces.app;

import frisney.com.github.projetointerfaces.classes.Subtracao;

public class TesteSubtracao {
    public static void main(String[] args) {
        Subtracao sub = new Subtracao();
        System.out.println(sub.calcular(10f,10f));
    }
}
