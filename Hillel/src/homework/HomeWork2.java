package homework;

import java.util.Scanner;


public class HomeWork2 {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please select program from list[1-3]: ");
            System.out.println("1. Checking the number of the parity.");
            System.out.println("2. Displaying near to ten of the two numbers.");
            System.out.println("3. The sides of the rectangle.");
            System.out.print("You select: ");
            Scanner scanner = new Scanner(System.in);
            int program = scanner.nextInt();
            if (program == 1) {
                testEvenNumber();
                System.out.println('\n');
            } else if (program == 2) {
                soClose();
                System.out.println('\n');
            } else if (program == 3) {
                rectangle();
                System.out.println('\n');
            } else {
                System.out.println("Error select program.\n");
            }
        }

    }

    public static void testEvenNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for check: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else System.out.println("Odd");
    }

    public static void soClose() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int fistNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        final int finalNumber = 10;

        int diff1 = finalNumber - fistNumber;
        if (diff1 <= 0) diff1 = diff1 * -1;

        int diff2 = finalNumber - secondNumber;
        if (diff2 <= 0) diff2 = diff2 * -1;


        System.out.println(diff1);
        System.out.println(diff2);

        if (diff1 < diff2) {
            System.out.println("First number is nearest to 10");
        } else if (diff1 == diff2) {
            System.out.println("First number = Second number are nearest to 10");
        } else System.out.println("Second number is nearest to 10");

    }

    public static void rectangle() {
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
