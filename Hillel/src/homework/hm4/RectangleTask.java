package homework.hm4;

import java.util.Scanner;

/**
 * Created by djkoka on 06.10.2015.
 */
public class RectangleTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Area(S): ");
        double s = scanner.nextDouble();
        System.out.print("Enter Perimeter(P): ");
        double p = scanner.nextDouble();

        double a, b, c;
        a = 1;
        b = p / 2;
        c = s;

        double d = Math.pow(b, 2) - 4 * a * c;

        if (d < 0)
            System.out.println("Error!");
        else if (d == 0) {
            double x = (-b) / (2 * a);
            System.out.println("Side A and B =" + x * -1);
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Side A = " + Math.abs(x1));
            System.out.println("Side B = " + Math.abs(x2));
        }
    }
}
