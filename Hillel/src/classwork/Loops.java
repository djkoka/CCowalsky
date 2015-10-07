package classwork;

import java.util.Scanner;

/**
 * Created by CCowalsky on 01.10.2015.
 */
public class Loops {
    public static void main(String[] args) {


    }

    private static void fOr() {
        for (int i = 0; i < 10; i++) {
            System.out.println("for loop " + i);
        }
    }

    private static void doWhile() {
        Scanner scanner = new Scanner(System.in);
        String yesNo;

        do {
            System.out.println("Yes/No");
            yesNo = scanner.next();
        } while (!(yesNo.equals("Yes")) || yesNo.equals("No"));
    }


    private static void wHile() {
        int money = 10000;
        int months = 0;

        while (money < 1500) {
            money += 100;
            months++;
        }
        System.out.println("money " + money + " months " + months);
    }
}
