package br.com.systec.model;

public class PedidoItem {

    private Produto produto;
    private Double quantidade;
    private Double valorUnitario;
    private Double valorTotal;
    private Double desconto;

    public PedidoItem(Produto produto, Double quantidade, Double valorUnitario, Double valorTotal, Double desconto) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
    }

    public Produto getProduto() {
        return produto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
