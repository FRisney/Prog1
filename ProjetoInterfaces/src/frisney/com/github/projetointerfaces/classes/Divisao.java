package frisney.com.github.projetointerfaces.classes;

public class Divisao implements CalculaInterface{
    @Override
    public Float calcular(Float n1, Float n2) {
        return n1 / n2;
    }
}
