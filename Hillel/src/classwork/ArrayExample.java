package classwork;

import java.util.Scanner;

/**
 * Created by CCowalsky on 01.10.2015.
 */
public class ArrayExample {
    public static void main(String[] args) {
        int[] inArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < inArray.length; i++) {
            inArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < inArray.length; i++) {
            System.out.println("first " + i + " volue " + inArray[i]);
        }
        for (int value : inArray) {
            System.out.println("value " + value);
        }
    }


    private static void arrayInit() {
        int[] ints = {1, 1, 8, 4};
        int ints2[] = {2, 5, 4, 6, 7};

        int value = ints2[2];
        System.out.println(value);

        int[] inputValue = new int[3];


        Scanner scanner = new Scanner(System.in);
        inputValue[0] = scanner.nextInt();
        inputValue[1] = scanner.nextInt();
        inputValue[2] = scanner.nextInt();

        System.out.println("first " + inputValue[0]);
        System.out.println("second " + inputValue[1]);
        System.out.println("third " + inputValue[2]);
    }
}
