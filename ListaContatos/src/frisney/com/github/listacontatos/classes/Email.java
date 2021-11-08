package frisney.com.github.listacontatos.classes;

public class Email {

    private String endereco;

    public Email(String endereco) {
        this.endereco = endereco;
    }

    public Email(String[] args){
        this.endereco = args[0];
    }

    public String recupera() {
        return endereco;
    }

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
