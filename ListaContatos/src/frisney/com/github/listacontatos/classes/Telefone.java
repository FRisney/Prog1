package frisney.com.github.listacontatos.classes;

import frisney.com.github.listacontatos.enums.TipoTelefone;
import frisney.com.github.listacontatos.interfaces.IRecuperavel;

public class Telefone extends Identificacao implements IRecuperavel {
    private String numero;
    private TipoTelefone tipo;

    Telefone(String numero, TipoTelefone tipo){
        this.numero = numero;
        this.tipo = tipo;
        this.infoID = newID();
    }

    Telefone(String[] args){
        if (args[0] == null || args[0].isEmpty()) args[0] = "CELULAR";
        else {
            int count = 0;
            for (TipoTelefone tipoT : TipoTelefone.values()) {
                if (args[0].equals(tipoT.name())) continue;
                ++count;
            }
            if (count >= TipoTelefone.values().length) args[0] = "CELULAR";
        }
        this.numero = args[1];
        this.tipo = TipoTelefone.valueOf(args[0].toUpperCase());
        this.infoID = newID();
    }

    Telefone(String numero, String tipo){
        if (tipo == null || tipo.isEmpty()) tipo = "CELULAR";
        else {
            int count = 0;
            for (TipoTelefone tipoT : TipoTelefone.values()) {
                if (tipo.equals(tipoT.name())) continue;
                ++count;
            }
            if (count >= TipoTelefone.values().length) tipo = "CELULAR";
        }
        this.numero = numero;
        this.tipo = TipoTelefone.valueOf(tipo.toUpperCase());
        this.infoID = newID();
    }

    @Override
    public String recupera() {
        String t = tipo.name();
        return "Telefone " + t.charAt(1) + t.substring(1).toLowerCase() + ": " + numero;
    }

    @Override
    public String recupera(String info) {
        return null;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public TipoTelefone getTipo() { return tipo; }
    public void setTipo(TipoTelefone tipo) { this.tipo = tipo; }

}
