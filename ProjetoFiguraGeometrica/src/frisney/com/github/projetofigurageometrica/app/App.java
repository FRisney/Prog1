package frisney.com.github.projetofigurageometrica.app;

import frisney.com.github.projetofigurageometrica.classes.Circulo;
import frisney.com.github.projetofigurageometrica.classes.Quadrado;
import frisney.com.github.projetofigurageometrica.classes.Retangulo;
import frisney.com.github.projetofigurageometrica.classes.Triangulo;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Triangulo ===");
        Triangulo tri = new Triangulo(3f, 4f, 5f);
        System.out.println("Perimetro: " + tri.calculaPerimetro());
        System.out.println("Area: " + tri.calculaArea());
        System.out.println("");

        System.out.println("=== Retangulo ===");
        Retangulo ret = new Retangulo(3f,5f);
        System.out.println("Perimetro: " + ret.calculaPerimetro());
        System.out.println("Area: " + ret.calculaArea());
        System.out.println("");

        System.out.println("=== Quadrado ===");
        Quadrado qua = new Quadrado(3f);
        System.out.println("Perimetro: " + qua.calculaPerimetro());
        System.out.println("Area: " + qua.calculaArea());
        System.out.println("");

        System.out.println("=== Circulo ===");
        Circulo cir = new Circulo(3f);
        System.out.println("Perimetro: " + cir.calculaPerimetro());
        System.out.println("Area: " + cir.calculaArea());
        System.out.println("");
    }
}
