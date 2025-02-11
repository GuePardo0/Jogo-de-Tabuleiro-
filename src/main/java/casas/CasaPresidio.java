package casas;

import validadores.FabricaValidador;

public class CasaPresidio extends Casa {
    private FabricaValidador fabricaValidador = new FabricaValidador();

    public CasaPresidio() {
        this.caractere = "#";
    }

    public void aplicarEfeito() {
        String request = "\nVocê caiu em um presídio!\n\n";
        request += "Você possui \033[33m" + jogador.getMoedas() + " moedas\033[0m.\n";
        request += "Você deseja pagar \033[33m2 moedas\033[0m para sair do presídio?\n";
        request += "s - sim     n - não\n";
        String userInput = screen.input(request, fabricaValidador.criarBooleanValidador("s", "n"));
        screen.clear();
        if (userInput.equals("s")) {
            if (jogador.getMoedas() >= 2) {
                jogador.setMoedas(jogador.getMoedas() - 2);
                request = "Você pagou 2 moedas e saiu do presídio.\n";
                request += "Agora você possui \033[33m" + jogador.getMoedas() + " moedas\033[0m.\n";
            } else {
                request = "Você não possui moedas suficientes para sair do presídio.\n\n";
                request += "Você não jogará no próximo turno.\n";
                jogador.setJogaProximoTurno(false);
            }
        } else {
            request += "Você não jogará no próximo turno.\n";
            jogador.setJogaProximoTurno(false);
        }
        request += "Pressione Enter para continuar.\n";
        screen.input(request);
    }
}
