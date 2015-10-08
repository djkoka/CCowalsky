package homework.hm4;

import java.util.Scanner;

/**
 * Created by djkoka on 07.10.2015.
 */
public class Crypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter message:");
        String scr = scanner.next();
        System.out.println("Enter key:");
        String key = scanner.next();
        Crypted coding = new Crypted(key);
        String cryptMessage = coding.crypt(scr);
        System.out.println(cryptMessage);
        String encrypt = cryptMessage;
        encrypt = coding.crypt(encrypt);
        System.out.println(encrypt);
    }
}
