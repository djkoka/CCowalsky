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
                System.out.println("Result: " + result);
                
                break;
            case "-":
                b = getB(scanner);
                result = (a - b);
                System.out.println("Result: " + result);
                break;
            case "*":
                b = getB(scanner);
                result = (a * b);
                System.out.println("Result: " + result);
                break;
            case "/":
                b = getB(scanner);
                result = (a / b);
                System.out.println("Result: " + result);
                break;
            case "trunk":
                int trunk = (int) a;
                System.out.println("Result: " + trunk);
                break;
            case "fract":
                trunk = (int) a;
                float fract = (float) a - trunk;
                System.out.println("Result: " + fract);
                break;
            default:
                System.out.println("Invalid operator");

        }
    }

    public static double getB(Scanner scanner) {
        System.out.print("Enter second: ");
        return scanner.nextDouble();
    }

}



