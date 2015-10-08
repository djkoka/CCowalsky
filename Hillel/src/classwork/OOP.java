package classwork;

import java.util.Arrays;

public class OOP {

    static String shardString;//поле класса

    public static void main(String[] args) {

        shardString = "some string";

        int i = 10;
        add(i);
        System.out.println(i);
        System.out.println(shardString);


        int[] ints = new int[3];
        ints[0] = 1;
        ints[0] = 2;
        ints[0] = 3;
        add(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(shardString);


    }

    private static void add(int[] ints) {
        ints[0] = ints[0] + 1;
        ints[1] = ints[1] + 1;
        ints[2] = ints[2] + 1;
        shardString = "shared string after add int[] method";

    }


    public static void add(int i) {
        i++;
        shardString = "shared string after add int i method";

    }

    public static void printString() {
        System.out.println(shardString);
    }

}
