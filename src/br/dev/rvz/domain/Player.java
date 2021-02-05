package br.dev.rvz.domain;

import java.io.Serializable;

public class Player implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer number;
    private Integer points;


    public Player() {
    }

    public Player(Integer number, Integer points) {
        this.number = number;
        this.points = points;
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

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
