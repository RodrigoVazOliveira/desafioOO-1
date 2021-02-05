package br.dev.rvz.domain;

import java.io.Serializable;

public class Game implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer point;
    private Integer minPoint;
    private Integer minNumberRandom;
    private Integer maxNumberRandom;
    private Integer numberRandom;

    public Game(Integer point, Integer minPoint, Integer numberRandom) {
        this.point = point;
        this.minPoint = minPoint;
        this.numberRandom = numberRandom;
        this.minNumberRandom = numberRandom - 1;
        this.maxNumberRandom = numberRandom + 1;

    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getMinPoint() {
        return minPoint;
    }

    public void setMinPoint(Integer minPoint) {
        this.minPoint = minPoint;
    }

    public Integer getMinNumberRandom() {
        return minNumberRandom;
    }

    public void setMinNumberRandom(Integer minNumberRandom) {
        this.minNumberRandom = minNumberRandom;
    }

    public Integer getMaxNumberRandom() {
        return maxNumberRandom;
    }

    public void setMaxNumberRandom(Integer maxNumberRandom) {
        this.maxNumberRandom = maxNumberRandom;
    }

    public Integer getNumberRandom() {
        return numberRandom;
    }

    public void setNumberRandom(Integer numberRandom) {
        this.numberRandom = numberRandom;
    }
}
