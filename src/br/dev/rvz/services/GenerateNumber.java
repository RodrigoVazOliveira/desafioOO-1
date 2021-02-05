package br.dev.rvz.services;

import java.util.Random;

public class GenerateNumber {

    /**
     *  gera um número aleatório conforme intervalor informado
     * @param Integer interval - intervalo a ser gerado o novo número
     * @return Integer - retorna o número gerado
     * @see Random
     * */
    public static Integer next(Integer interval) {
        return new Random().nextInt(interval);
    }

}
