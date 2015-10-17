package homework.hm6.figures;

/**
 * Created by djkoka on 15.10.2015.
 */
public class Circle extends Figures {
    private double r;  //radius

    public Circle(double r) {
        this.r = r;
    }


    @Override
    public double Square() {
        return Math.PI * Math.sqrt(r);
    }

    @Override
    public double Perimetr() {
        return (Math.PI*2)*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
