package classwork.OOP.TDD;

import java.util.Arrays;

/**
 * Created by CCowalsky on 19.10.2015.
 */
public class Sorter {
    public Comparable[] sort(Comparable[] array) {
        Comparable[] copy = Arrays.copyOf(array, array.length);
        for (int i = 0; i<copy.length; i++) {
            for (int j = i+1; j < copy.length; j++) {

                Comparable first = copy[i];
                Comparable secoud = copy[j];
                int g = first.compareTo(secoud);

                if (g > 0) {
                    Comparable tmp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = tmp;
                }
            }
        }return copy;
    }
}
