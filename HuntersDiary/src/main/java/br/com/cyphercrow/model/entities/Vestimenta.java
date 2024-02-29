package br.com.cyphercrow.model.entities;

import br.com.cyphercrow.model.enums.TipoElementoEnum;
import br.com.cyphercrow.model.enums.TipoEquipamentoEnum;
import br.com.cyphercrow.model.interfaces.Objeto;

public class Vestimenta implements Objeto {
    private String nome;
    private String descricao;
    private TipoEquipamentoEnum tipo;
    private Protecao protecao;

    public Vestimenta(String nome, String descricao, TipoEquipamentoEnum tipo, TipoElementoEnum elemento, int pp, int ppE){
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;

        /*Define referente a resistencia, assim como o caçador existe o Físico*/
        protecao = new Protecao(elemento,pp,ppE);
    }
}
