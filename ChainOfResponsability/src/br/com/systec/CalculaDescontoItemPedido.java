package br.com.systec;

import br.com.systec.model.Pedido;
import br.com.systec.model.PedidoItem;

public class CalculaDescontoItemPedido extends PedidoProcesso{

    public CalculaDescontoItemPedido(PedidoProcesso proximo) {
        super(proximo);
    }

    @Override
    public Pedido executa(Pedido pedido) {
        calculaDescontoItem(pedido);
        return super.executa(pedido);
    }

    private Pedido calculaDescontoItem(Pedido pedido){

        for(PedidoItem item : pedido.getListaDeItem()){
            System.out.println("Calculando desconto do item.: "
                    +item.getProduto().getDescricao()
                    + " / "+item.getValorTotal()
                    + " / "+item.getDesconto());

            Double descontoTotal = (item.getValorTotal() * (item.getDesconto()/100));

            double valorTotalComDesconto = item.getValorTotal() - descontoTotal;
            item.setValorTotal(valorTotalComDesconto);

            System.out.println("Valor total com desconto.: "+item.getValorTotal());
        }

        return pedido;
    }
}
