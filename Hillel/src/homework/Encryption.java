package homework;


/**
 * Created by djkoka on 03.10.2015.
 */
public class Encryption {
    public static void main(String[] args) {

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