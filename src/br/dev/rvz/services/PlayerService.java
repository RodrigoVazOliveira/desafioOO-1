package br.dev.rvz.services;

import br.dev.rvz.controllers.IO;
import br.dev.rvz.domain.Game;
import br.dev.rvz.domain.Player;

public class PlayerService {

    private Player player;
    private Game game;

    public PlayerService(Player player, Game game) {
        this.player = player;
        this.game = game;
    }


    public void startGaming() {
        int pointsPlayer = player.getPoints();
        pointsPlayer += printResult(player.getNumber());
        player.setPoints(pointsPlayer);
    }

    private Integer validationAsset(Integer number) {
        if (number == game.getNumberRandom()) {
            return game.getPoint();
        } else if (number == game.getMinNumberRandom() || number == game.getMaxNumberRandom()) {
            return game.getMinPoint();
        } else {
            return 0;
        }
    }

    private Integer printResult(Integer number) {
        int point = validationAsset(number);
        if (point > 0) {
            IO.out("Você acertou! Parabéns, você ganhou mais " + point);
            return point;
        } else {
            IO.out("Você perdeu! Lamento.");
            return point;
        }
    }

}
