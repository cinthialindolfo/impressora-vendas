package br.ufpb.dcx.rodrigor.vendasImpressora;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class SistemaControleVendas implements Impressora {

    private ImpressoraEpson impressora;
    private Map<String, Pedido> pedidos = new HashMap<>();

    // public void setImpressora(ImpressoraEpson impressora, String opcao){
    //     this.impressora = impressora;
    // }


    public void setImpressora(String opcaoImpressora, Pedido pedido){

        //Lógica
        if (opcaoImpressora.equalsIgnoreCase("Epson")) {

            this.pedidos.put(opcaoImpressora, pedido);//adicionar um pedido e a opção
            impressoraEpson(this.pedidos.get(opcaoImpressora));//Vai retornar um pedido
        }
        else if (opcaoImpressora.equalsIgnoreCase("HP")) {
            this.pedidos.put(opcaoImpressora, pedido);//adicionar um pedido e a opção
            impressoraHP(this.pedidos.get(opcaoImpressora));//Vai retornar um pedido

        }

        System.out.println("Impressora não encontrada!!");


    }
    /**
     * @param pedido
     */
    @Override
    public void impressoraEpson(Pedido pedido) {
        
        System.out.println("Imprimindo cupom do pedido na impressora EPSON"+pedido);
    }

    @Override
    public void impressoraHP(Pedido pedido) {
        System.out.println("Imprimindo cupom do pedido na impressora HP"+pedido);
        
    }
}
