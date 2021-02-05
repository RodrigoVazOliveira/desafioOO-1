package br.dev.rvz.config;

import br.dev.rvz.domain.Game;
import br.dev.rvz.services.GenerateNumber;

public class DefaultGame {
    public Game start() {
        Game game = new Game(10, 5, GenerateNumber.next(20));
        return game;
    }
}
