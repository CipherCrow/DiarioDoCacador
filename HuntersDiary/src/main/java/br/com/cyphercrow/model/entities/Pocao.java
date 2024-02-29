package br.com.cyphercrow.model.entities;

import br.com.cyphercrow.model.interfaces.Objeto;

public class Pocao implements Objeto {

    private String nome;
    private int quantidade;
    private String descricao;

    public Pocao(){}
    public Pocao(String nome,String descricao, int quantidade){
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
}
