package br.com.cyphercrow.model.entities;

public class Fisico {
    private int pv; /*Pontos de Vida*/
    private int pvMax; /*Pontos de Vida Maximos*/
    private int exaustao=0; /*Nivel de Cansaço*/
    private int debilitacao; /*Machucado ou status*/

    public Fisico(){}

    public Fisico(int valorMaximo){
        this.pvMax = valorMaximo;
        this.pv = pvMax;
    }
}
