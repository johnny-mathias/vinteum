package com.example;

public class Computador extends Jogador {
    public boolean parou(){
        return getPontos() > 16;
    }
}
