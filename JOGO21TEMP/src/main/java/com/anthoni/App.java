package com.anthoni;

public class App {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.embaralho();

        while (!baralho.vazio()) {
            Carta c = baralho.pegaDeCima();
            System.out.println(c.toString());
        }

        baralho = new Baralho();
        baralho.embaralho();
        Deck deck = new Deck();

        while (!baralho.vazio()) {
            deck.insereEmbaixo(baralho.pegaDeCima());
        }

        System.out.println(deck);
        System.out.println("Somatório das cartas: " + deck.somatorio());
    }
}
