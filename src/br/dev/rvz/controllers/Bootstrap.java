package br.dev.rvz.controllers;

import br.dev.rvz.config.DefaultGame;
import br.dev.rvz.domain.Game;
import br.dev.rvz.domain.Player;
import br.dev.rvz.services.GameService;
import br.dev.rvz.services.PlayerService;

public class Bootstrap {

    private DefaultGame defaultGame;
    private Game game;
    private Player player;
    private GameService gameService;
    private PlayerService playerService;

    public Bootstrap() {
        defaultGame = new DefaultGame();
        game = defaultGame.start();
        player = new Player();
        player.setPoints(0);

        gameService = new GameService();
        playerService = new PlayerService(player, game);
        gameService.startGaming(player, playerService, defaultGame);
    }
}
