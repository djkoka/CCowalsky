package homework;

import java.util.Scanner;

/**
 * Created by djkoka on 02.10.2015.
 */
public class Telegraph {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String message = scanner.next();
        double cost = 7.5;
        String message = "Hello world!";
        String[] words = message.split("");
        System.out.println("In the message: "+words.length+" symbols.");
        System.out.println("The cost of paying for a telegram: " +
                +words.length*cost+" tugricov");
    }
}
