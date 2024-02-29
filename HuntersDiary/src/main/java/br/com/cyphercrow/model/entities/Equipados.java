package br.com.cyphercrow.model.entities;

import br.com.cyphercrow.model.interfaces.Objeto;

import java.util.List;

public class Equipados {
    /*Mais simples abstrair para variaveis do que criar uma Lista*/
    private Vestimenta Elmo;
    private Vestimenta Armadura;
    private Vestimenta Braceletes;
    private Vestimenta Botas;
    private List<Objeto> maos;
    private int qtdMaosLivres = 2;
}
