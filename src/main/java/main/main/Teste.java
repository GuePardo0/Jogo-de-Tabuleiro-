package main.main;

import java.util.ArrayList;

import classes.Tabuleiro;
import jogadores.Jogador;
import jogadores.JogadorComSorte;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        Jogador jogador1 = new JogadorComSorte("azul");
        Jogador jogador2 = new JogadorComSorte("vermelho");
        Jogador jogador3 = new JogadorComSorte("amarelo");
        Jogador jogador4 = new JogadorComSorte("roxo");
        Jogador jogador5 = new JogadorComSorte("cinza");
        Jogador jogador6 = new JogadorComSorte("verde");
        jogadores.add(jogador1);
        jogadores.add(jogador2);
        jogadores.add(jogador3);
        jogadores.add(jogador4);
        jogadores.add(jogador5);
        jogadores.add(jogador6);
        Tabuleiro tabuleiro = Tabuleiro.getInstancia();
        tabuleiro.criarCasasAleatorias(25);
        tabuleiro.setJogadores(jogadores);
        tabuleiro.setNumJogadores(6);
        System.out.println(tabuleiro.getTabuleiro());
    }
}
