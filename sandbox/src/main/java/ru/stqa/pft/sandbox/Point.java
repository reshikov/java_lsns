package ru.stqa.pft.sandbox;

/**
 * Created by reshikov on 04.12.16.
 */
public class Point {

    public double x1, y1, x2, y2;

    public double distance() {
        return Math.sqrt((this.x2-this.x1)*(this.x2-this.x1)+(this.y2-this.y1)*(this.y2-this.y1));

    }

}

