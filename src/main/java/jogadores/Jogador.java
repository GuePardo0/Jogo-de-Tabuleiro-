package jogadores;

import java.util.ArrayList;

public abstract class Jogador {
    protected String cor;
    protected int posicao;
    protected int moedas;
    protected boolean jogaProximoTurno;
    protected boolean ganharaMoedas;
    protected int quantidadeDeJogadas;
    protected ArrayList<String> itens = new ArrayList<>();

    public Jogador(String cor) {
        this.cor = cor;
        this.posicao = 0;
        this.jogaProximoTurno = true;
        this.ganharaMoedas = false;
        this.quantidadeDeJogadas = 0;
    }

    public abstract ArrayList<Integer> jogarDados();

    public void aumentarQuantidadeDeJogadas() {
        this.quantidadeDeJogadas++;
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

    public boolean getGanharaMoedas() {
        return this.ganharaMoedas;
    }

    public void setGanharaMoedas(boolean ganharaMoedas) {
        this.ganharaMoedas = ganharaMoedas;
    }

    public int getQuantidadeDeJogadas() {
        return this.quantidadeDeJogadas;
    }

    public void setQuantidadeDeJogadas(int quantidadeDeJogadas) {
        this.quantidadeDeJogadas = quantidadeDeJogadas;
    }

    public int getMoedas() {
        return this.moedas;
    }

    public void setMoedas(int moedas) {
        this.moedas = moedas;
    }

    public ArrayList<String> getItens() {
        return this.itens;
    }
}
