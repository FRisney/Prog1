package frisney.com.github.projetofigurageometrica.classes;

public class Circulo implements FiguraGeometricaInterface{
    private Float raio;

    public Circulo(Float raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * Math.pow(this.raio,2);
    }

    @Override
    public double calculaPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    public Float getRaio() { return raio; }
    public void setRaio(Float raio) { this.raio = raio; }
}
