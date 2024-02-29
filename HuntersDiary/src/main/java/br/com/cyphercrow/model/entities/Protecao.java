package br.com.cyphercrow.model.entities;

import br.com.cyphercrow.model.enums.TipoElementoEnum;

public class Protecao {
    private TipoElementoEnum elementoEnum;
    private int pp; /*Pontos de Proteção*/
    private final int ppMax; /*Pontos de Proteção Max*/
    private int ppE = 0; /*Pontos de Proteção Elemental*/
    private final int ppEMax; /*Pontos de Proteção Elemental Max*/

    public Protecao(TipoElementoEnum elemento,int ppMax,int ppEMax){
        this.elementoEnum = elemento;
        this.ppMax = ppMax;
        this.ppEMax = ppEMax;
        /*Com os pontos de proteção maximos definidos, usaremos apenas as variaveis menores daqui em diante*/

        this.pp = ppMax;
        this.ppE = ppEMax;
    }
}
