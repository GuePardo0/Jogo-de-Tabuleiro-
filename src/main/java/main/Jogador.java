package main;

import java.util.ArrayList;

public abstract class Jogador {
    protected String cor;
    protected int posicao;
    protected boolean jogaProximoTurno;
    protected int quantidadeDeJogadas;

    public Jogador(String cor) {
        this.cor = cor;
        this.posicao = 0;
        this.jogaProximoTurno = true;
        this.quantidadeDeJogadas = 0;
    }

    public Jogador(String cor, int posicao, int quantidadeDeJogadas) {
        this.cor = cor;
        this.posicao = posicao;
        this.jogaProximoTurno = true;
        this.quantidadeDeJogadas = quantidadeDeJogadas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPosicao() {
        return this.posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public boolean getJogaProximoTurno() {
        return this.jogaProximoTurno;
    }

    public void setJogaProximoTurno(boolean jogaProximoTurno) {
        this.jogaProximoTurno = jogaProximoTurno;
    }

    public int getQuantidadeDeJogadas() {
        return this.quantidadeDeJogadas;
    }

    public void setQuantiadeDeJogadas(int quantidadeDeJogadas) {
        this.quantidadeDeJogadas = quantidadeDeJogadas;
    }

    public abstract ArrayList<Integer> jogarDados();

    public void aumentarQuantidadeDeJogadas() {
        this.quantidadeDeJogadas++;
    }
}
