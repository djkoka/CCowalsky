package homework.hm6.figures;

/**
 * Created by djkoka on 15.10.2015.
 */
public class Parallelogram extends Figures {
    private double a;
    private double b;
    private double h;

    public Parallelogram(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double Perimetr() {
        return 2*(a+b);
    }

    @Override
    public double Square() {
        return a*h;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "a=" + a +
                ", b=" + b +
                ", h=" + h +
                '}';
    }
}
