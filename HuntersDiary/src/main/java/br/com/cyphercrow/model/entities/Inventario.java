package br.com.cyphercrow.model.entities;

import br.com.cyphercrow.model.interfaces.Objeto;

import java.util.List;

public class Inventario {
    /*Itens no corpo e mãos*/
    private Equipados equipados;
    /*Itens que serão levados para a caçada na fase de rastreamento*/
    private List<Objeto> mochila;
    /*Itens que não serão usados na caçada*/
    private List<Objeto> guardados;

    public void setMochila(List<Objeto> mochila){
        this.mochila = mochila;
    }
}