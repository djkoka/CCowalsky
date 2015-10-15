package homework.hm6.figures;

/**
 * Created by djkoka on 14.10.2015.
 */
public abstract class Figures {
    public abstract double Square();
    public abstract double Perimetr();

    public static void main(String[] args) {
        Figures figures = new Circle(4);
        double s = figures.Square();
        System.out.println(s);
    }

}

