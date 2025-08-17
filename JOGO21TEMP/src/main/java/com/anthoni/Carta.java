package com.anthoni;

public class Carta {
    private ValorCarta valor;
    private Naipe naipe;

    public Carta(ValorCarta valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public ValorCarta getValor() {
        return valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    @Override
    public String toString() {
        return "Carta [valor=" + valor + ", naipe=" + naipe + "]";
    }
}
