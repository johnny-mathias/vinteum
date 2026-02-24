package com.example;

public class Computador extends Jogador{

    @Override
    public boolean parou(){
        return getPontos() > 16;
    }


    public boolean estourou(){
        return getPontos() > 21;
    }
}
