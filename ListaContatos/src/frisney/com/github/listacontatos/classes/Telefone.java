package frisney.com.github.listacontatos.classes;

import frisney.com.github.listacontatos.enums.TipoTelefone;

public class Telefone {
    private String numero;
    private TipoTelefone tipo;

    public Telefone(String numero, TipoTelefone tipo){
        this.numero = numero;
        this.tipo = tipo;
    }

    @Override
    public String toString() { return recupera(); }

    public String recupera() {
        String t = tipo.name();
//        return "Telefone " + t.charAt(0) + t.substring(1).toLowerCase() + ": " + numero;
        return numero;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public TipoTelefone getTipo() { return tipo; }
    public void setTipo(TipoTelefone tipo) { this.tipo = tipo; }

}
