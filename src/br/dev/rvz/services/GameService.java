package br.dev.rvz.services;

import br.dev.rvz.controllers.IO;

public class GameService {

    public void welcome() {
        IO.out("Bem vindo ao jogo do adivinha!");
        IO.out("digite um número a ser adivinhado: ");
    }

}
