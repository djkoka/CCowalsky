package homework;

import java.util.Scanner;

/**
 * Created by djkoka on 03.10.2015.
 */
public class Encryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter string: ");
        String src = in.nextLine();

        System.out.print("Enter key (int): ");
        int pKey = in.nextInt();

        System.out.format("\nSource string:\t%s\n", src);

        //  String encrypted = encrypt(src, pKey);
        // System.out.format("Encrypted string:\t%s\n", encrypted);

        //String decrypted = decrypt(encrypted, -pKey);
        //System.out.format("Decrypted string:\t%s\n\n", decrypted);

    }

    public byte[] encrypt(String src, String pKey) {
        byte[] txt = src.getBytes();
        byte[] key = pKey.getBytes();
        byte[] res = new byte[txt.length];
        for (int i = 0; i < txt.length; i++) {
            res[i] = (byte) (txt[i] ^ key[i % key.length]);
        }
        return res;
    }

    public String decrypt(byte[] pText, String pKey) {
        byte[] res = new byte[pText.length];
        byte[] key = pKey.getBytes();
        for (int i = 0; i < pText.length; i++) {
            res[i] = (byte) (pText[i] ^ key[i % key.length]);
        }
        return new String(res);
    }

}
