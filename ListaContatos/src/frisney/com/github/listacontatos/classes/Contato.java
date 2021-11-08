package frisney.com.github.listacontatos.classes;

import frisney.com.github.listacontatos.enums.TipoInfo;

public class Contato {
    private final String nome;
    private final String sobrenome;
    private String observacao;
    private Email email;
    private Endereco endereco;
    private Telefone telefone;

    public Contato(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String recupera() {
        return nome + ' ' + sobrenome + '\n' +
                ((observacao != null) ? observacao : "") + '\n' +
                "----" + '\n' +
                getTelefone() + '\n' +
                getEmail() + '\n' +
                getEndereco() + '\n';
    }

    public String getEndereco(){
        return (endereco != null) ? endereco.recupera() : "";
    }

    public String getTelefone(){
        return (telefone != null) ? telefone.recupera() : "";
    }

    public String getEmail(){
        return (email != null) ? email.recupera() : "";
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setInfo(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setInfo(Telefone tel) {
        this.telefone = tel;
    }

    public void setInfo(Email email) {
        this.email = email;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}