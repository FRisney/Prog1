package frisney.com.github.listacontatos.classes;

import frisney.com.github.listacontatos.interfaces.IRecuperavel;

public class Email extends Identificacao implements IRecuperavel {

    private String endereco;

    public Email(String endereco) {
        this.endereco = endereco;
    }

    public Email(String[] args){
        this.endereco = args[0];
    }

    @Override
    public String recupera() {
        return endereco;
    }

    @Override
    public String recupera(String info) {
        if (info.equals("endereco"))
            return endereco;
        return "";
    }

    @Override
    public String toString() {
        return recupera();
    }

    public void setEndereco(String endereco) { this.endereco = endereco; }
}
