package com.anthoni;

import java.util.Random;

public class Baralho {
    private static final int TAM_BARALHO = 52;
    private Carta[] cartas;
    private int cartaDeCima;

    public Baralho() {
        cartaDeCima = 0;
        cartas = new Carta[TAM_BARALHO];
        int pos = 0;
        for (Naipe n : Naipe.values()) {
            for (ValorCarta v : ValorCarta.values()) {
                Carta carta = new Carta(v, n);
                cartas[pos] = carta;
                pos++;
            }
        }
    }

    public boolean vazio() {
        return cartaDeCima >= TAM_BARALHO;
    }

    public Carta pegaDeCima() {
        if (cartaDeCima == TAM_BARALHO) {
            throw new IllegalStateException("Baralho vazio");
        }
        Carta c = cartas[cartaDeCima];
        cartaDeCima++;
        return c;
    }

    public void embaralho() {
        Random random = new Random();
        for (int i = TAM_BARALHO - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Carta temp = cartas[i];
            cartas[i] = cartas[j];
            cartas[j] = temp;
        }
        cartaDeCima = 0;
    }
}
