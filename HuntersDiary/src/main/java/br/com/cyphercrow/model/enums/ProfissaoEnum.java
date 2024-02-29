package br.com.cyphercrow.model.enums;

import br.com.cyphercrow.model.entities.Armamento;
import br.com.cyphercrow.model.entities.Pocao;
import br.com.cyphercrow.model.entities.Vestimenta;
import br.com.cyphercrow.model.interfaces.Objeto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum ProfissaoEnum {
    Eremita(22,
            Arrays.asList(VantagensEnum.Companheiro,VantagensEnum.Furtividade),
            Arrays.asList(new Armamento("Sabre","(Corporal 1 mão; Dano 3)",3,AlcanceEnum.Corporal,1, Arrays.asList(CaracteristicaArmasEnum.Nenhuma)),
                          new Armamento("Adaga","(Corporal 1 mão; Dano 2; Arremesso)",2,AlcanceEnum.Corporal,1,Arrays.asList(CaracteristicaArmasEnum.Arremesso)),
                          new Armamento("Arco de Guerra","(Distância 2 mãos; Dano 3; Flechas)",2,AlcanceEnum.Distancia,2,Arrays.asList(CaracteristicaArmasEnum.Flechas)),
                          new Vestimenta("Armadura de Couro","(8 PP)",TipoEquipamentoEnum.Armadura,TipoElementoEnum.Nenhum,8,0),
                          new Pocao("Poção de Vida","Aquele que beber recupera todos os pontos perdidos de vida e de fadiga.",2))),
    Academico(20,
            Arrays.asList(VantagensEnum.Alquimia,VantagensEnum.Anatomia) ),
    Ferreiro(22,
            Arrays.asList(VantagensEnum.Ferragem,VantagensEnum.Forca) ),
    Nobre(20,
            Arrays.asList(VantagensEnum.Montaria,VantagensEnum.Status) ),
    Barbaro(30,
            Arrays.asList(VantagensEnum.Incivilizado,VantagensEnum.Forca) ),
    Mistico(20,
            Arrays.asList(VantagensEnum.VisaoArcana,VantagensEnum.Magia) );

    ProfissaoEnum(int pontosDeVida, List<VantagensEnum> vantagensIniciais, List<Objeto> mochilaInicial){
        this.pontosDeVida = pontosDeVida;
        this.vantagensIniciais = vantagensIniciais;
        this.mochilaInicial = mochilaInicial;
    }
    private int pontosDeVida;
    private List<VantagensEnum> vantagensIniciais;
    private List<Objeto> mochilaInicial;
    public int getPontosDeVida() {
        return this.pontosDeVida;
    }
    public List<VantagensEnum> getVantagens() {
        return this.vantagensIniciais;
    }

    public List<Objeto> getMochilaInicial() { return this.mochilaInicial; }
}
