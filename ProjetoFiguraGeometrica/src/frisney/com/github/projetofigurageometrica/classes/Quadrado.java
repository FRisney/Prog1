package frisney.com.github.projetofigurageometrica.classes;

public class Quadrado implements FiguraGeometricaInterface{

    private Float lado;

    public Quadrado(Float lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return Math.pow(this.lado,2);
    }

    @Override
    public double calculaPerimetro() {
        return this.lado * 4;
    }

    public Float getLado() { return lado; }
    public void setLado(Float lado) { this.lado = lado; }
}
