package com.example;

public class Jogo {
    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo(){
        monte.embaralhar();
    }

    public Carta distribuiCartaParaJogador(Jogador jogador){
        if(jogador.parou()) return null;

        var carta = monte.virar();
        jogador.receberCarta(carta);
        return carta;
    }

    public boolean acabou(){
        return jogador.parou() && computador.parou() ||
                jogador.estourou() || computador.estourou();
    }

    public String resultado(){
        if(jogador.estourou() && computador.estourou())return "Empatou";
        if(jogador.getPontos() == computador.getPontos())return "Empatou";

        if(computador.estourou())return "Você ganhou";
        if(jogador.getPontos() > computador.getPontos() && !jogador.estourou()) return "Você ganhou";

        return "Você perdeu";
    }
}
