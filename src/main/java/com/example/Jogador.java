package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    // atributos
    private int pontos = 0;
    private List<Carta> cartas = new ArrayList<>();
    private boolean parou = false;


    // getters
    public int getPontos() {
        return pontos;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    // métodos particulares
    public void receberCarta(Carta carta){
        cartas.add(carta);
        pontos += carta.getNumero();
    }

    public boolean parou(){
        return parou;
    }

    public void parar(){
        parou = true;
    }

    public boolean estourou(){
        return getPontos() > 21;
    }
}
