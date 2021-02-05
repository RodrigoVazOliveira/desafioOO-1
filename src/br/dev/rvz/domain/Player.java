package br.dev.rvz.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Player implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer number;
    private Integer points;
    private List<Integer> asset = new ArrayList<>();
    private List<Integer> errors = new ArrayList<>();


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

    public List<Integer> getAsset() {
        return asset;
    }

    public List<Integer> getErrors() {
        return errors;
    }
}
