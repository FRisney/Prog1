package frisney.com.github.projetofigurageometrica.app;

import frisney.com.github.projetofigurageometrica.classes.*;

public class TesteFigura {
    public static void main(String[] args) {
        FiguraGeometricaInterface fig = new Quadrado(3f);
        // FiguraGeometricaInterface fig = new Retangulo(3f,5f);
        // FiguraGeometricaInterface fig = new Circulo(3f);
        // FiguraGeometricaInterface fig = new Triangulo(3f,4f,5f);
        System.out.println("Perimetro: " + fig.calculaPerimetro());
        System.out.println("Area: " + fig.calculaArea());
    }
}
