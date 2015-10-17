package homework.hm6.figures;

/**
 * Created by djkoka on 15.10.2015.
 */
public class Rectangle extends Figures {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double Square() {
        return a * b;
    }

    @Override
    public double Perimetr() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
