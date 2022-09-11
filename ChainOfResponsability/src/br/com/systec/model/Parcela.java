package br.com.systec.model;

public class Parcela {

    private Integer numeroParcela;
    private Double valorParcela;

    public Parcela(Integer numeroParcela, Double valorParcela) {
        this.numeroParcela = numeroParcela;
        this.valorParcela = valorParcela;
    }

    public Integer getNumeroParcela() {
        return numeroParcela;
    }

    public Double getValorParcela() {
        return valorParcela;
    }
}
