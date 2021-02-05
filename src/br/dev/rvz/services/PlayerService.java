package br.dev.rvz.services;

import br.dev.rvz.domain.Game;
import br.dev.rvz.domain.Player;

public class PlayerService {

    private Player player;
    private Game game;

    public PlayerService(Player player, Game game) {
        this.player = player;
        this.game = game;
    }

    public void startGaming(Integer number) {

    }

    private Integer validationAsset(Integer number) {
        if (number == game.getNumberRandom()) {
            return game.getPoint();
        } else if (number == || number == game.getMinPoint()) {
            return
        }
    }

}
