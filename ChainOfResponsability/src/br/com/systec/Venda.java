package br.com.systec;

import br.com.systec.fake.PedidoFake;
import br.com.systec.model.Pedido;

public class Venda {

    public static void main(String[] args) {
        Pedido pedido = PedidoFake.geraPedidoFake();

        PedidoProcesso processo = new CalculaDescontoItemPedido(
                new CalculaDescontoTotalPedido(null)
        );

        processo.executa(pedido);
    }

}
