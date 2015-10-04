package homework.hw3;


import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int randomNum = 0;
        int minimum = 1;
        int maximum = 1000;
        int tryAgain = 0;
        randomNum = minimum + (int) (Math.random() * maximum);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            if (number == randomNum){
                System.out.println("You WIN!!");
                break;
            } else if (number >= randomNum) {
                System.out.println(" menbwe");
            } else System.out.println(" 6olbwe ");
            tryAgain++;
            System.out.println("Try: "+tryAgain);
        }
    }
}
