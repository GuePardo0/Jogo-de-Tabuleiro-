package main.main;

import classes.Jogo;
import classes.Screen;
import validadores.FabricaValidador;

public class Main {
    private static final FabricaValidador fabricaValidador = new FabricaValidador();
    private static final Screen screen = new Screen();
    public static void main(String[] args) {
        // inicializar jogo
        Jogo jogo = new Jogo();

        // pedir número de casas
        screen.clear();
        System.out.println("Bem Vindo ao melhor jogo de tabuleiro do mundo todinho!\n");
        int numCasas = Integer.parseInt(screen.input("Digite o número de casas do tabuleiro.\n", fabricaValidador.criarIntegerValidador()));

        // configurar tabuleiro
        jogo.configTabuleiro(numCasas);

        // pedir número de jogadores
        screen.clear();
        int numJogadores = Integer.parseInt(screen.input("Digite o número de jogadores que irá jogar.\n", fabricaValidador.criarIntegerValidador(2, 6)));

        // configurar jogadores
        jogo.configJogadores(numJogadores);

        // iniciar jogo
        jogo.start();
    }
}
