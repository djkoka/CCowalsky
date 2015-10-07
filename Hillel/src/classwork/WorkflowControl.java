package classwork;

import java.util.Scanner;

/**
 * Created by CCowalsky on 24.09.2015.
 */
public class WorkflowControl {
    public static void main(String[] args) {

        double d = 2.0;
        inEven(d);
        inEven((int) d, true);


    }

    private static void notOperation() {
        boolean todayIsthursday = true;
        boolean iShouldStudyJava = true;
        todayIsthursday = !(todayIsthursday && iShouldStudyJava);
        boolean isEben = !isOdd(10);
    }

    public static boolean isOdd(int someNumber) {
        if (someNumber % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
    // ! <- logic no

    private static void ternaryExempl() {
        int number = 5;
        String inEven = inEven(number);
        inEven = (number % 2 == 0) ? "Yes" : "No";// тернарный оператор
        System.out.println(inEven);
    }

    public static String inEven(int someNumber) {
        System.out.println("vasya bul zdesb int");
        if (someNumber % 2 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static boolean inEven(int someNumber, boolean someNumber1) {
        System.out.println("vasya bul zdesb int, double");
        if (someNumber % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean inEven(double someNumber) {
        System.out.println("vasya bul zdesb double");
        if (someNumber % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void mMoo() {
        String month = "mar";
        switch (month) {
            case "jan":
            case "feb":
            case "dec":
                System.out.println("winter");
                break;
            case "mar":
            case "apr":
            case "may":
                System.out.println("spring");
                break;

            default:
                System.out.println("error");
                break;

        }
    }

    private static void scAse() {
        int month = 2;


        switch (month) {
            case 1:
                System.out.println("jan");
                break;
            case 5:
                System.out.println("may");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("wrong month number");
                break;
            case 2:
                System.out.println("feb");
                break;
        }
    }

    private static void ifExpamls() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¬ведите возрост ");
        int age = scanner.nextInt();

        if (age < 20) {
            System.out.println("you are young");
        } else {
            System.out.println("you aren`t so young");
        }

        if (age < 10) {
            System.out.println("kid");
        } else if (age < 20) {
            System.out.println("teen");
        } else if (age < 50) {
            System.out.println("adult");
        } else {
            System.out.println("old");
        }

        if (age >= 0 && age <= 10) {
            System.out.println("Kid");
        }
        if (age >= 10 && age <= 20) {
            System.out.println("Teen");
        }
        if (age >= 20 && age <= 50) {
            System.out.println("Adult");
        }
        if (age >= 50) {
            System.out.println("Old");
        }
    }

    private static void ifExpan() {
        boolean condition = true;


        if (condition)
            System.out.println("in IF");

        if (condition) {
            System.out.println("in IF");
            System.out.println("still in IF block");
        }
        System.out.println("out of IF block");

        if (condition) {
            System.out.println("in IF");
            System.out.println("still in IF block");
        } else {
            System.out.println("in Else block");
        }
    }
}
