package homework;

import java.util.Arrays;

/**
 * Created by djkoka on 17.10.2015.
 */
public class Sort {
    public static void main(String[] args) {

        int[] ints = new int[15];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 100);
            System.out.print(ints[i] + " ");
        }
        System.out.println("\n");
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println("\n");

        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 100);
            System.out.print(ints[i] + " ");
        }
        System.out.println("\n");

        SelectSort sort = new SelectSort();
        sort.bubbleSort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println("\n");

        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 100);
            System.out.print(ints[i] + " ");
        }
        System.out.println("\n");


        sort.selectionSort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println("\n");
    }
}
