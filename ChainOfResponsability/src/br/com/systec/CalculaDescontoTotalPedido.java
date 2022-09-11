package br.com.systec;

import br.com.systec.model.Pedido;
import br.com.systec.model.PedidoItem;

public class CalculaDescontoTotalPedido extends PedidoProcesso{


    public CalculaDescontoTotalPedido(PedidoProcesso proximo) {
        super(proximo);
    }

    @Override
    public Pedido executa(Pedido pedido) {
        this.calculaDesconto(pedido);
        return super.executa(pedido);
    }

    private Pedido calculaDesconto(Pedido pedido){
        System.out.println("Valor total sem desconto.:: "+pedido.getValorTotal());

        double valorTotalComDesconto = pedido.getListaDeItem().stream().mapToDouble(PedidoItem::getValorTotal).sum();

        pedido.setValorTotal(valorTotalComDesconto);

        System.out.println("Valor total com desconto.:: "+pedido.getValorTotal());
        return pedido;
    }
}
