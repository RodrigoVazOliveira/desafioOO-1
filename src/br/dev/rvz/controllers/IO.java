package br.dev.rvz.controllers;

import java.util.Scanner;

public class IO {

    /**
     * proxy do scanner para leitura de daods no console/CLI
     * @return Scanner - Retorna um novo objeto de Scanner
     * @see Scanner
     * */
    public static Scanner input() {
        return new Scanner(System.in);
    }

    /**
     * imprimi na tela do console o texto passsado
     * @param String - texto a ser imprimido na tela
     *
     * */
    public static void out(String text) {
        System.out.println(text);
    }
}
