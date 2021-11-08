package frisney.com.github.listacontatos.classes;

import frisney.com.github.listacontatos.enums.PartesEndereco;

public class Endereco {

    private final String cep;
    private final String rua;
    private final String complemento;
    private final String cidade;
    private final String estado;

    public Endereco(String cep, String rua, String complemento, String cidade, String estado) {
        this.cep = cep;
        this.rua = rua;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String recupera() {
        return cep + " | " + rua + ", " + complemento + ", " + cidade + " - " + estado + '\n';
    }

    public String recupera(PartesEndereco info) {
        return switch (info) {
            case RUA -> rua;
            case CEP -> cep;
            case ESTADO -> estado;
            case CIDADE -> cidade;
            case COMPLEMENTO -> complemento;
        };
    }

    @Override
    public String toString() {
        return recupera();
    }
}
