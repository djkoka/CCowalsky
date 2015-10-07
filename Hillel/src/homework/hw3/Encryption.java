package homework.hw3;

import java.util.Scanner;

/**
 * Created by djkoka on 03.10.2015.
 */
public class Encryption {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter message");
        String scr = in.nextLine();
        char key = '@';
        String crypted = crypt(scr, key);
        System.out.println("Message crypted _" + crypted+"_");

        String decrypted = crypt(crypted, key);
        System.out.println("Decrypted message " + decrypted);
    }

    public static String crypt(String scr, char key) {
        char[] chars = scr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] ^= key;
        }
        String crypted = String.copyValueOf(chars);
        return crypted;
    }
}
