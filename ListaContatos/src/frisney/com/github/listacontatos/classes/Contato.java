package frisney.com.github.listacontatos.classes;

import frisney.com.github.listacontatos.interfaces.IRecuperavel;

import java.util.ArrayList;

public class Contato implements IRecuperavel {
    private String nome;
    private String sobrenome;
    private String empresa;
    private String descricao;
    private ArrayList<Email>    emails;
    private ArrayList<Endereco> enderecos;
    private ArrayList<Telefone> telefones;

    public Contato(String nome){
        this.nome = nome;
    }

    @Override
    public String recupera() {
        StringBuilder ret = new StringBuilder();
        ret.append(nome).append(' ').append(sobrenome).append('\n');
        ret.append(empresa).append('\n');
        ret.append(descricao).append('\n');
        ret.append("----").append('\n');
        for (Telefone tel :
                this.telefones) {
            ret.append(tel.recupera());
        }
        ret.append('\n');
        for (Email email :
                this.emails) {
            ret.append(email.recupera());
        }
        ret.append('\n');
        for (Endereco end :
                this.enderecos) {
            ret.append(end.recupera());
        }
        return ret.toString();
    }

    @Override
    public String recupera(String info) {
        return switch (info) {
            case "enderecos" -> enderecos.toString();
            case "telefones" -> telefones.toString();
            case "emails" ->    emails.toString();
            default -> recupera();
        };
    }

    public boolean addInfo(String info, String[] args) {
        switch (info) {
            case "endereco" -> {
                Endereco endereco = new Endereco(args);
                enderecos.add(endereco);
                }
            case "telefones" -> {
                Telefone tel = new Telefone(args);
                telefones.add(tel);
            }
            case "emails" -> {
                Email email = new Email(args);
                emails.add(email);
            }
        }
        return true;
    }

}
