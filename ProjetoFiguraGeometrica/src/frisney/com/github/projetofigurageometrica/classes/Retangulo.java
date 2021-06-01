package frisney.com.github.projetofigurageometrica.classes;

public class Retangulo implements FiguraGeometricaInterface{

    private Float base;
    private Float altura;

    public Retangulo(Float altura, Float base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calculaArea() {
        return this.base * this.altura;
    }

    @Override
    public double calculaPerimetro() {
        return (this.altura * 2) + (this.base * 2);
    }

    public Float getAltura() { return altura; }
    public void setAltura(Float altura) { this.altura = altura; }

    public Float getBase() { return base; }
    public void setBase(Float base) { this.base = base; }
}
