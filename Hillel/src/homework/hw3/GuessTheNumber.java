package homework.hw3;


import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        int minimum = 1;
        int maximum = 1000;
        int tryAgain = 0;
        int number = 0;
        int randomNum = minimum + (int) (Math.random() * maximum);
        while (randomNum != number) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number: ");
            number = scanner.nextInt();
            if (number == randomNum) {
                System.out.println("You WIN!!");

            } else if (number >= randomNum) {
                System.out.println(" menbwe");
            } else System.out.println(" 6olbwe ");
            tryAgain++;
            System.out.println("Try: " + tryAgain);
        }
    }
}
