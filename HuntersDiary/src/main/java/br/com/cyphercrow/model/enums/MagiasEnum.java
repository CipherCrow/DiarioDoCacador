package br.com.cyphercrow.model.enums;

public enum MagiasEnum {
    BolaDeFogo("Bola de Fogo",
            TipoElementoEnum.Fogo,
            "Ataque a distância, 7 [Fogo] de dano.",
            7),
    RajadaDeGelo("Rajada de Gelo",
            TipoElementoEnum.Gelo,
            "Ataque a distância, 5 [Gelo] de dano e paralisia da parte (não pode usar a parte paralisada para atacar por um turno).",
            5),
    Relampago("Relampago",
            TipoElementoEnum.Eletricidade,
            "Ataque a distância, 6 [Eletricidade] de dano e o próximo ataque da besta será o mesmo da rodada anterior.",
            6),
    JatoDeAcido("Jato de Ácido",
            TipoElementoEnum.Acido,
            "Ataque a distância, 4 [Ácido] de dano, que receberá mais 4 [Ácido] de dano no próximo turno.",
            4),
    Cura("Cura",
            TipoElementoEnum.Nenhum,
            "Recupera 1d6 pontos de vida.",
            0),
    Escudo("Escudo",
            TipoElementoEnum.Nenhum,
            "Depois de conjurar, até o final do combate, você pode Bloquear ataques como se estivesse de escudo. Não ocupa a mão depois de conjurada.",
            0);

    MagiasEnum(String nome,TipoElementoEnum elemento,String descricao,int dano){
        this.nome = nome;
        this.elemento = elemento;
        this.descricao = descricao;
        this.dano = dano;
    }
    private String nome;
    private TipoElementoEnum elemento;
    private String descricao;
    private int dano;
}
