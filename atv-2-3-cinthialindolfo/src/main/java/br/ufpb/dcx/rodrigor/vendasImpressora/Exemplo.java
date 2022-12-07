package br.ufpb.dcx.rodrigor.vendasImpressora;

public class Exemplo {

    public static void main(String[] argsadd){
        SistemaControleVendas controleVendas = new SistemaControleVendas();

        //(1) PASSO
        Pedido pedido = new Pedido();//jogar valores / parametros



        //=========================================================

        // (2) PASSO
        // Scanner / JOptionPane (Inserir)
        String opcaoImpressoa = "";

        // =========================================================

        // (3) PASSO
        controleVendas.setImpressora(opcaoImpressoa, pedido);

        
        // controleVendas.setImpressora(new ImpressoraEpson());


        // controleVendas.setImpressora(new ImpressoraHP());

    }
}
