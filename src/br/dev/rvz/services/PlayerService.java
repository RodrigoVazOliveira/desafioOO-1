package br.dev.rvz.services;

import br.dev.rvz.controllers.IO;
import br.dev.rvz.domain.Game;
import br.dev.rvz.domain.Player;

public class PlayerService {

    private final Player player;
    private final Game game;

    public PlayerService(Player player, Game game) {
        this.player = player;
        this.game = game;
    }


    public void startGaming() {
        int pointsPlayer = player.getPoints();
        pointsPlayer += printResult(player.getNumber());
        player.setPoints(pointsPlayer);
    }

    private Integer validationAsset(int number) {
        if (number == game.getNumberRandom()) {
            return game.getPoint();
        } else if (number == game.getMinNumberRandom() || number == game.getMaxNumberRandom()) {
            return game.getMinPoint();
        } else {
            return 0;
        }
    }

    /**
     * valida a o jogo e imprimi se o jogador acertou ou errou
     * @param number - número que foi escolhido pelo jogador
     * @return Integer - número de pontos ganhos
     * */
    private Integer printResult(Integer number) {
        int point = validationAsset(number);
        if (point > 0) {
            IO.out("Você acertou! Parabéns, você ganhou mais " + point);
            player.getAsset().add(number);
        } else {
            IO.out("Você perdeu! Lamento.");
            player.getErrors().add(number);
        }
        return point;
    }

    /**
     * exibir o pontuação final do jogador
     *
     * */
    public void pointFinalGame() {
        IO.out("Sua pontuação final é: " + player.getPoints());
        IO.out("número que você acertou: " + player.getAsset());
        IO.out("número que você errou: " + player.getErrors());
    }

}
