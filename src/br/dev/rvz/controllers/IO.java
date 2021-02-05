package br.dev.rvz.controllers;

import java.util.Scanner;

public class IO {
    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static void out(String text) {
        System.out.println(text);
    }
}
