package frisney.com.github.projetofigurageometrica.classes;

public class Triangulo implements FiguraGeometricaInterface{
    private Float lado1;
    private Float lado2;
    private Float lado3;

    public Triangulo(Float lado1, Float lado2, Float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calculaArea() {
        double semiperimetro = this.calculaPerimetro() / 2;
        double area = Math.sqrt(
                semiperimetro *
                ( semiperimetro - this.lado1 ) *
                ( semiperimetro - this.lado2 ) *
                ( semiperimetro - this.lado3 )
        );
        return area;
    }

    @Override
    public double calculaPerimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }

    public Float getLado1() { return lado1; }
    public void setLado1(Float lado1) { this.lado1 = lado1; }

    public Float getLado2() { return lado2; }
    public void setLado2(Float lado2) { this.lado2 = lado2; }

    public Float getLado3() { return lado3; }
    public void setLado3(Float lado3) { this.lado3 = lado3; }
}
