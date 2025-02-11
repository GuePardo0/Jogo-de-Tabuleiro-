package casas;


public class CasaMagica extends Casa {
    public CasaMagica() {
        this.caractere = "+";
    }

    public void aplicarEfeito() {
        String request = "\nVocê caiu em uma casa mágica!\n\n";

        // procurar jogador com menor posição
        int menorPosicao = tabuleiro.getNumCasas();
        int indiceJogadorComMenorPosicao = 0;
        for (int i = 0; i < tabuleiro.getNumJogadores(); i++) {
            if (tabuleiro.getJogadores().get(i).getPosicao() < menorPosicao) {
                menorPosicao = tabuleiro.getJogadores().get(i).getPosicao();
                indiceJogadorComMenorPosicao = i;
            }
        }

        // trocar os dois jogadores
        tabuleiro.getJogadores().get(indiceJogadorComMenorPosicao).setPosicao(jogador.getPosicao());
        jogador.setPosicao(menorPosicao);

        // mensagem na tela
        if (indexJogador != indiceJogadorComMenorPosicao) {
            request += "Você trocará com o jogador que está mais atrás.\n";
            request += "Que será o jogador " + tabuleiro.getJogadores().get(indiceJogadorComMenorPosicao).getCor() + "\n";
        } else {
            request += "Você é o último jogador :/ não será trocado.\n";
        }
        request += "Pressione Enter para continuar.\n";
        screen.input(request);
    }
}
