package homework.hw3;

import java.util.Scanner;

/**
 * Created by djkoka on 06.10.2015.
 */
public class Deposit {
    public static void main(String[] args) {
        System.out.println("Enter the amount of the deposit");
        Scanner enter = new Scanner(System.in);
        double sum = enter.nextDouble();
        System.out.println("Enter the number of months");
        int month = enter.nextInt();
        int counter = 0;
        double amount = sum;
        while (counter < month) {
            amount = amount * (0.03 / 12) + amount;
            counter++;
        }
        System.out.printf("Amount will be %.2f after %d month\n", amount, month);
        amount = 0;
        month = 0;
        do {
            amount = sum * 0.03 / 12 + amount;
            month++;
        } while (amount < sum);
        System.out.printf("After %.1f  year deposit exceeded amount ", month / 12.0);
    }
}