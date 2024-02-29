package br.com.cyphercrow.model.entities;

import br.com.cyphercrow.model.enums.MagiasEnum;
import br.com.cyphercrow.model.enums.ProfissaoEnum;
import br.com.cyphercrow.model.enums.VantagensEnum;

import java.util.List;

public class Cacador {
    //private ProfissaoEnum profissao;
    private String nome;
    private String sexo;
    private String profissao;
    private Fisico fisico;
    private List<VantagensEnum> vantagens;
    private List<MagiasEnum> magias = null;
    private Inventario inventario = new Inventario();

    public Cacador(){}
    public Cacador(ProfissaoEnum profissao){
        this.profissao = profissao.name();
        this.fisico = new Fisico(profissao.getPontosDeVida());
        this.vantagens = profissao.getVantagens();
        this.inventario.setMochila(profissao.getMochilaInicial());
    }

}
