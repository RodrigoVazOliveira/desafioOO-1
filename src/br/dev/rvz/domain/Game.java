package br.dev.rvz.domain;

import java.io.Serializable;

public class Game implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer point;
    private Integer minPoint;
    private Integer maxPoint;

    public Game() {
    }

    public Game(Integer point, Integer minPoint, Integer maxPoint) {
        this.point = point;
        this.minPoint = minPoint;
        this.maxPoint = maxPoint;
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

    public Integer getMaxPoint() {
        return maxPoint;
    }

    public void setMaxPoint(Integer maxPoint) {
        this.maxPoint = maxPoint;
    }
}
