package br.com.cyphercrow.model.enums;

public enum CaracteristicaArmasEnum {
    Arremesso("Esta arma pode ser usada como uma arma à distância com -1 de dano. Porém, se fizer isso, perderá essa arma e só poderá recuperá-la depois do combate."),
    Flechas("Esta arma dispara flechas e você precisa contar seus usos. Esta arma começa com 10 disparos e pode ser recarregada depois de uma noite de descanso (fazer flechas comuns é barato e fácil). Estas armas também podem usar flechas especiais feitas de partes de Bestas, mas essas flechas têm uso único."),
    Pesado("Por 1 de fadiga, pode fazer um ataque que, além de causar o dano, impede um próximo ataque da parte atacada."),
    Longo("Esta arma pode atacar até 1 nível de altura a mais se você estiver montado em um cavalo."),
    Torque("Se usar esta arma com as duas mãos, causa +1 de dano."),
    /*Criado para contornar null pointer e deixar o código mais bonito*/
    Nenhuma("Nada de especial por aqui.");

    CaracteristicaArmasEnum(String descricao){
        this.descricao = descricao;
    }
    private String descricao;
}