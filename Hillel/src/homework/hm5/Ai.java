package homework.hm5;

import java.util.Scanner;

/**
 * Created by djkoka on 09.10.2015.
 */
public class Ai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a Number[1-1000]: ");
        int number = scanner.nextInt();
        int guesenumber = 1;
        while (guesenumber != number){
            guesenumber++;
        }
        System.out.println("You number "+guesenumber);

    }
}
