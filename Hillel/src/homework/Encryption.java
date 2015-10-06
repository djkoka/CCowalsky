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
        int key = in.nextInt();

        System.out.format("\nSource string:\t%s\n", src);

        String encrypted = encrypt(src, key);
        System.out.format("Encrypted string:\t%s\n", encrypted);

        String decrypted = decrypt(encrypted, key);
        System.out.format("Decrypted string:\t%s\n\n", decrypted);
    }

    private static String encrypt(String src, int key) {
        return shiftChars(src, key);
    }

    private static String decrypt(String src, int key) {
        return shiftChars(src, -key);
    }

    private static String shiftChars(String src, int posCount) {
        StringBuilder result = new StringBuilder();
        for (char ch : src.toCharArray()) {
            result.append(Character.toString((char)(ch + posCount)));
        }
        return result.toString();
    }
}
/*
Реализовать шифрование с использованием "исключающего или" (XOR)
Физический смысл: если шифруем строку один раз - получаем
зашифрованное сообщение,если зашифрованное шифруем
с тем же ключом ещё раз - расшифрованное
Метод, который будет шифровать-расшифровывать:
public static String crypt(String message, char key)
Что может понадобиться:
строку можно преобразовать в массив символов
char[] chars = "someText".toCharArray();
и наоборот:
String someString = String.copyValueOf(cahrs);
собственно процесс зашифровывания:
char crypedChar ^= key;
*/