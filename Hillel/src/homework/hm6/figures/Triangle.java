package homework.hm6.figures;

/**
 * Created by djkoka on 15.10.2015.
 */
public class Triangle extends Figures {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public double Perimetr() {
        return a + b + c;
    }

    @Override
    public double Square() {
        return (a * b * Math.sin(c)) / 2;
    }
}
