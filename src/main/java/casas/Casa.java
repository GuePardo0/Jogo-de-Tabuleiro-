package casas;

import classes.Screen;
import classes.Tabuleiro;
import jogadores.Jogador;

public abstract class Casa {
    protected Screen screen = new Screen();
    protected String caractere;
    protected Tabuleiro tabuleiro;
    protected int indexJogador;
    protected Jogador jogador;

    public abstract void aplicarEfeito();

    public void setJogador(int indexJogador) {
        this.indexJogador = indexJogador;
        this.jogador = tabuleiro.getJogadores().get(indexJogador);
    }

    public String getCaractere() {
        return caractere;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
}
