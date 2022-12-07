package br.ufpb.dcx.rodrigor.vendasImpressora;

public interface Impressora {
    

    /**
     * @param pedido
     */
    public void impressoraEpson(Pedido pedido);

    void impressoraHP(Pedido pedido);


}
