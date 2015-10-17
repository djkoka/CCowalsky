package homework.hm4;

import java.util.Scanner;

/**
 * Created by djkoka on 07.10.2015.
 */
public class Crypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter key and message:");
        Scrambler scram = new Scrambler(scanner.next(),scanner.next() );
        System.out.println("Crypted message: " + scram.crypt());
        System.out.println("Decrypted message " + scram.crypt());

    }
}
