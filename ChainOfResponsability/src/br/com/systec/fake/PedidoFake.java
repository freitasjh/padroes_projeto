package br.com.systec.fake;

import br.com.systec.model.Pedido;
import br.com.systec.model.Produto;

import java.util.Random;

public class PedidoFake {

    public static Pedido geraPedidoFake(){

        Pedido pedido = new Pedido();
        for(int index = 0; index < 10;index++){
            double randomValue = 1.5 + (20.0 - 1.5) * new Random().nextDouble();
            Produto produto = new Produto("Produto "+index+1, randomValue);

            pedido.adicionaItem(produto, (index+2.0), 0.5);
        }

        return pedido;
    }
}
