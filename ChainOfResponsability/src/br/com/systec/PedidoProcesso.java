package br.com.systec;

import br.com.systec.model.Pedido;

public abstract class PedidoProcesso {

    private PedidoProcesso proximoProcesso;

    public PedidoProcesso(PedidoProcesso proximo){
        this.proximoProcesso = proximo;
    }

    public Pedido executa(Pedido pedido){
        if(proximoProcesso != null){
            return proximoProcesso.executa(pedido);
        }

        return pedido;
    }

}
