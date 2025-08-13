package com.anthoni

public class Baralho {
    private static final int TAM_BARALHO = 52;
    private Carta[] cartas;
    private int cartaDeCima;

    public Baralho(){
        cartaDeCima = 0;
        cartas = new Carta[TAM_BARALHO];
        int pos = 0;
        for(Naipe n:Naipe.values()) {
            for(ValorCarta v:ValorCarta.values()){
                Carta carta = new Carta(v,n);
                //cartas[pos++] = carta;
                cartas[pos] = carta;
                //pos++;
                pos++;
            }
        }
    }

    public boolean vazio(){
        return cartaDeCima >= TAM_BARALHO;
    }
    public Carta pegaDeCima(){
        if(cartaDeCima == TAM_BARALHO){
        throw new IllegalStateException(s:"Bralho vazio")
        }
    Carta c = cartas[cartaDeCima];
    cartaDeCima++
    return c;
    }
}