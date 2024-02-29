package br.com.cyphercrow.model.enums;

public enum VantagensEnum {
    Companheiro("Você possui um animal de estimação. Ele pode ser Agressivo (10 PV; Dano 2), Voador (8 PV; Dano 1; Voa e nunca é alvo direto) ou Rastreador (10 PV; Dano 1; Rerrola uma vez quando rastrear)."),
    Furtividade("Sempre que tentar se esconder da Besta, você soma 1 ao resultado do Esconderijo."),
    Alquimia("Quando fizer poções usando Ingredientes Alternativos, só precisa da metade dos ingredientes necessários."),
    Anatomia("Quando estiver dissecando a carcaça da Besta, só falha se cair 1 no dado para extrair as partes."),
    Ferragem("Você pode gastar metade (arredondando para cima) de Minérios para produzir equipamentos básicos."),
    Forca("Quando escalar a Besta, adicione sempre 1 ao resultado da rolagem de Escalada."),
    Montaria("Você possui um cavalo leal (15 PV). Quando estiver sobre o cavalo, você tem +1 nas rolagens de Esquiva."),
    Status("Quando estiver buscando informações na cidade, pode rolar 6 dados em vez de 3."),
    Incivilizado("Você não é bem visto entre os habitantes das cidades, role apenas 2 dados na etapa de Investigação."),
    VisaoArcana("Quando encontrar a Besta você já identifica a Fraqueza dela."),
    Magia("Para conjurar você usa uma das mãos e consome 1 de Fadiga. (Você pode adquirir novas magias sacrificando o tronco e a cabeça de uma Besta cujo elemento seja da magia escolhida).");

    VantagensEnum(String descricao){
        this.descricao = descricao;
    }
    private String descricao;

    private String getDescricao(){
        return this.descricao;
    }
}
