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
        double amount = sum;
        for (int counter = 0; counter < month; counter++) {
            amount = amount * (0.03 / 12) + amount;
        }
        System.out.format("Amount will be %.2f after %d month\n", amount, month);
        amount = 0;
        month = 0;
        while (amount < sum) {
            amount = sum * 0.03 / 12 + amount;
            month++;
        }
        System.out.format("After %.1f  year deposit exceeded amount ", month / 12.0);
    }
}