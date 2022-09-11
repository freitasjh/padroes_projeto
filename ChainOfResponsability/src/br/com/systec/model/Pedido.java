package br.com.systec.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private double valorTotal;
    private double quantidadeTotal;
    private List<Parcela> listaDeParcela;
    private List<PedidoItem> listaDeItem;

    public double getValorTotal() {
        return valorTotal;
    }

    public double getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public List<Parcela> getListaDeParcela() {
        return listaDeParcela;
    }

    public List<PedidoItem> getListaDeItem() {
        return listaDeItem;
    }

    public void adicionaItem(Produto produto, Double quantidade, Double desconto){
        if(listaDeItem == null){
            listaDeItem = new ArrayList<>();
        }

        quantidadeTotal += quantidade;
        valorTotal += produto.getValor() * quantidade;

        Double valorTotalItem = (produto.getValor() * quantidade);
        listaDeItem.add(new PedidoItem(produto, quantidade, produto.getValor(), valorTotalItem, desconto));
    }

    public void adicionaParcela(List<Parcela> listaDeParcelaGerada){
        this.listaDeParcela = listaDeParcelaGerada;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
