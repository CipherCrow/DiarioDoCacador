package br.com.cyphercrow.model.entities;

import br.com.cyphercrow.model.enums.AlcanceEnum;
import br.com.cyphercrow.model.enums.CaracteristicaArmasEnum;
import br.com.cyphercrow.model.interfaces.Objeto;

import java.util.ArrayList;
import java.util.List;

public class Armamento implements Objeto {
    private String nome;
    private String descricao;
    private int dano;
    private AlcanceEnum alcance;
    private int qtdMaosOcupantes;
    private List<CaracteristicaArmasEnum> caracteristicas;
    private int municao = 0;

    public Armamento(){}
    public Armamento(String nome,String descricao, int dano,AlcanceEnum alcance,int qtdMaos, List<CaracteristicaArmasEnum> caracteristicas){
        this.nome = nome;
        this.descricao = descricao;
        this.dano = dano;
        this.alcance = alcance;
        this.qtdMaosOcupantes = qtdMaos;
        this.caracteristicas = new ArrayList<>();
        caracteristicas.forEach(carac -> this.caracteristicas.add(carac));

        if(this.caracteristicas.contains(CaracteristicaArmasEnum.Flechas)){
            this.municao = 10;
        }
    }
    public void setCaracteristicas(List<CaracteristicaArmasEnum> caracteristicas){
        this.caracteristicas = caracteristicas;
    }
}