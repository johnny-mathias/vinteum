package com.example;

public class Carta {

    // atributos
    private int numero;
    private Naipe naipe;

    // construtores
    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    // getters
    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    // métodos particulares
    public String imagePath(){
        String[] prefixo = {"", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        return "classic-cards/" + prefixo[numero] + naipe + ".png";
    }
}
