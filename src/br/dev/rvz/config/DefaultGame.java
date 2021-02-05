package br.dev.rvz.config;

import br.dev.rvz.domain.Game;
import br.dev.rvz.services.GenerateNumber;

public class DefaultGame {

    private Game game;

    public Game start() {
        game = new Game(10, 5, GenerateNumber.next(5));
        return game;
    }

    public void updateNumberRandon() {
        game.setNumberRandom(GenerateNumber.next(5));
    }

    public void updateNumberRandomNivel(int level) {
        game.setMaxNumberRandom(GenerateNumber.next(level));
    }
}
