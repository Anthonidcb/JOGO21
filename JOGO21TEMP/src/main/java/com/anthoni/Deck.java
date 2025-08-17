package com.anthoni;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Carta> cartas;

    public Deck() {
        cartas = new ArrayList<>();
    }

    public Carta pegaDeCima() {
        if (cartas.isEmpty()) {
            throw new IllegalStateException("Deck vazio");
        }
        return cartas.remove(0);
    }

    public void insereEmbaixo(Carta carta) {
        cartas.add(carta);
    }

    public int somatorio() {
        int soma = 0;
        for (Carta c : cartas) {
            soma += c.getValor().ordinal() + 1;
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Deck:\n");
        for (Carta c : cartas) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }
}


