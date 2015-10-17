package homework.hm6.figures;

import homework.hm6.figures.Figures;

/**
 * Created by djkoka on 15.10.2015.
 */
public class Square extends Figures {
    private double h;

    public Square(double h) {
        this.h = h;
    }

    @Override
    public double Perimetr() {
        return 4 * h;
    }

    @Override
    public double Square() {
        return Math.pow(h, 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "h=" + h +
                '}';
    }
}
