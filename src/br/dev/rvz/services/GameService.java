package br.dev.rvz.services;

import br.dev.rvz.config.DefaultGame;
import br.dev.rvz.controllers.IO;
import br.dev.rvz.domain.Player;

public class GameService {

    private boolean playing;

    public GameService() {
        playing = true;
    }


    /**
     * metodo responsáviel por repetir a solciitaçaõ de números ao jogador
     * @param player - um player para jogar e colcoar os dados, número de adivinha
     * @param playerService - serviço de player para fazer as regras e verficações
     * @param defaultGame - mudar configurações do jogo
     * */
    public void startGaming(Player player, PlayerService playerService, DefaultGame defaultGame) {

        IO.out("Bem vindo ao jogo do adivinha!");
        IO.out("escolha o nível? ( 1 - 2 - 3)");
        int nivel = Integer.parseInt(IO.input().nextLine());
        defaultGame.updateNumberRandomNivel(nivel * 10);
        while (playing) {
            IO.out("digite um número a ser adivinhado: ");
            player.setNumber(Integer.parseInt(IO.input().nextLine()));
            playerService.startGaming();
            IO.out("Deseja tentar novamente? (s/n)");
            exitGaming(IO.input().nextLine(), defaultGame, nivel * 10);
        }
        playerService.pointFinalGame();

    }

    /**
     * verificar se o jogador vai sair do jogo
     * caso ele queira sair, será exibido a pontuação final
     * @param  String - resposta do jogador
     * @param defaultGame - para atualizar o número aleatório
     * */
    private void exitGaming(String response, DefaultGame defaultGame, int nivel) {

        if (response.equalsIgnoreCase("n")) {
            playing = false;
        } else {
            defaultGame.updateNumberRandomNivel(nivel);
        }
    }

}
