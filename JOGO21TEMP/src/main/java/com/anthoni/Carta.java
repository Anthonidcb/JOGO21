package com.anthoni;

public class Carta {
    private ValorCarta valor;
    private Naipe naipe;
    
    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
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
        return "Carta [numero=" + valor + ", naipe=" + naipe + "]";
    }

}