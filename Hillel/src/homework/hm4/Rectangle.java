package homework.hm4;

import java.util.Scanner;

/**
 * Created by djkoka on 06.10.2015.
 */
public class Rectangle {

    public static final int grade = 90;
    public static final String figure = "Quadrilateral";


    private double a;
    private double b;

    public Rectangle(double per, double sq) {
        RectangleTask rectangleTask = new RectangleTask(sq, per);
        Rectangle rectangle = rectangleTask.getRectangle();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Area(S): ");
        double s = scanner.nextDouble();
        System.out.print("Enter Perimeter(P): ");
        double p = scanner.nextDouble();
        Rectangle rectangle=new Rectangle(s,p);
        System.out.format("The sides are %.2f and %.2f \n", rectangle.a, rectangle.b);
    }

}
