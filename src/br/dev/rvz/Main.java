package br.dev.rvz;

import br.dev.rvz.config.DefaultGame;
import br.dev.rvz.controllers.IO;
import br.dev.rvz.domain.Game;
import br.dev.rvz.domain.Player;
import br.dev.rvz.services.GameService;
import br.dev.rvz.services.PlayerService;

public class Main {

    public static void main(String[] args) {
        Game game = new DefaultGame().start();
        Player player = new Player();
        player.setPoints(0);

        GameService gameService = new GameService();
        gameService.welcome();
        player.setNumber(Integer.parseInt(IO.input().nextLine()));
        PlayerService playerService = new PlayerService(player, game);
        playerService.startGaming();
    }
}
