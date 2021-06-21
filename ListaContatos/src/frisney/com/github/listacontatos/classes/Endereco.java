package frisney.com.github.listacontatos.classes;

import frisney.com.github.listacontatos.interfaces.IRecuperavel;

import java.util.ArrayList;

public class Endereco extends Identificacao implements IRecuperavel {

    private String cep;
    private String rua;
    private String complemento;
    private String cidade;
    private String estado;

    public Endereco(String[] args){
        this.cep = args[0];
        this.rua = args[1];
        this.complemento = args[2];
        this.cidade = args[3];
        this.estado = args[4];
        this.infoID = Identificacao.newID();
    }
    public Endereco(String cep, String rua, String complemento, String cidade, String estado) {
        this.cep = cep;
        this.rua = rua;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.infoID = Identificacao.newID();
    }

    @Override
    public String recupera() {
        return cep + " | " + rua + ", " + complemento + ", " + cidade + " - " + estado + '\n';
    }

    @Override
    public String recupera(String info) {
        return switch (info) {
            case "cep" -> cep;
            case "estado" -> estado;
            case "cidade" -> cidade;
            case "complemento" -> complemento;
            default -> rua;
        };
    }

    @Override
    public String toString() {
        return recupera();
    }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

}
