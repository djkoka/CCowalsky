package homework.hw3;

import java.util.Scanner;

/**
 * Created by djkoka on 03.10.2015.
 */
public class Encryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter message");
        String scr = scanner.next();
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

/*
Расширение задачи о шифровании.
В качестве ключа для зашифровывания сообщения использовать не char а char[].
При этом первый символ сообщения будет кодироваться первым символом ключа,
второй символ сообщения - вторым символом ключа и т.д.
Длинна ключа и длинна сообщения могут не совпадать. Если ключевые символы закончились - использовать их повторно.

Создать отдельный класс - шифратор.
Ключ шифратор получает через конструктор и хранит его. Обладает одним публичным методом:
public String crypt(String message)

Весь ввод-вывод не должен выходить за рамки main метода
(в самом шифраторе не должно быть ни System.out ни Scanner).
*/
