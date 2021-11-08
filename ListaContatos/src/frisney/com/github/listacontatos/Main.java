package frisney.com.github.listacontatos;

import frisney.com.github.listacontatos.classes.Contato;
import frisney.com.github.listacontatos.classes.Email;
import frisney.com.github.listacontatos.classes.Endereco;
import frisney.com.github.listacontatos.classes.Telefone;
import frisney.com.github.listacontatos.enums.TipoTelefone;

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato("Cara","do ceu");
        contato.setObservacao("que massa");
        contato.setInfo(new Telefone("1234", TipoTelefone.CELULAR));
        contato.setInfo(new Telefone("4321", TipoTelefone.FIXO));
        contato.setInfo(new Email("frisney@pm.me"));
        contato.setInfo(new Endereco("cep","rua","comp","cidade","estado"));
        System.out.println(contato.recupera());
    }
}
