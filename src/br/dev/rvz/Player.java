package br.dev.rvz;

import java.io.Serializable;

public class Player extends Serializable {
    private static final long serialVersionUID = 1L;

    private Integer number;

    public Player() {
    }

    public Player(Integer number) {
        this.number = number;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
