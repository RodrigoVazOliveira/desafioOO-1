package br.dev.rvz.services;

import br.dev.rvz.controllers.IO;
import br.dev.rvz.domain.Player;

public class GameService {

    private boolean playing;

    public GameService() {
        playing = true;
    }

    public void startGaming(Player player, PlayerService playerService) {
        IO.out("Bem vindo ao jogo do adivinha!");
        IO.out("digite um número a ser adivinhado: ");
        while (playing) {
            player.setNumber(Integer.parseInt(IO.input().nextLine()));
            playerService.startGaming();

            IO.out("Deseja tentar novamente? (s/n)");
            String response = IO.input().nextLine();

            if (response.equalsIgnoreCase("n")) {
                playing = false;
            }

        }

        playerService.pointFinalGame();
    }

}
