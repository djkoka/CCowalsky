package homework;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter operation[+,-,*,/,trunk,fract]: ");
        String op = scanner.next();


        switch (op) {
            case "+":
                double b = getB(scanner);
                double result = (a + b);
                System.out.print("Result: " + result + dataType(result));
                break;
            case "-":
                b = getB(scanner);
                result = (a - b);
                System.out.print("Result: " + result + dataType(result));
                break;
            case "*":
                b = getB(scanner);
                result = (a * b);
                System.out.print("Result: " + result + dataType(result));
                break;
            case "/":
                b = getB(scanner);
                result = (a / b);
                System.out.println("Result: " + result + dataType(result));
                break;
            case "trunk":
                int trunk = (int) a;
                System.out.print("Result: " + trunk);
                break;
            case "fract":
                trunk = (int) a;
                double fract = a - (int) a;
                System.out.println("Result: " + fract);
                break;
            default:
                System.out.println("Invalid operator");

        }

    }


    public static String dataType(double result) {
        if (result - (int) result != 0) {
            return " double";
        } else if (result >= Byte.MIN_VALUE && result <= Byte.MAX_VALUE) {
            return " byte";
        } else if (result >= Short.MIN_VALUE && result <= Short.MAX_VALUE) {
            return " short";
        } else if (result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE) {
            return " integer";
        } else if (result >= Long.MIN_VALUE && result <= Long.MAX_VALUE) {
            return " long";
        }
        return "";
    }


    public static double getB(Scanner scanner) {
        System.out.print("Enter second: ");
        return scanner.nextDouble();
    }

}


