package br.dev.rvz.services;

import br.dev.rvz.config.DefaultGame;
import br.dev.rvz.controllers.IO;
import br.dev.rvz.domain.Player;

public class GameService {

    private boolean playing;

    public GameService() {
        playing = true;
    }

    public void startGaming(Player player, PlayerService playerService, DefaultGame defaultGame) {

        IO.out("Bem vindo ao jogo do adivinha!");
        while (playing) {
            IO.out("digite um número a ser adivinhado: ");
            player.setNumber(Integer.parseInt(IO.input().nextLine()));
            playerService.startGaming();
            IO.out("Deseja tentar novamente? (s/n)");
            exitGaming(IO.input().nextLine(), defaultGame);
        }
        playerService.pointFinalGame();

    }

    private void exitGaming(String response, DefaultGame defaultGame) {

        if (response.equalsIgnoreCase("n")) {
            playing = false;
        } else {
            defaultGame.updateNumberRandon();
        }
    }

}
