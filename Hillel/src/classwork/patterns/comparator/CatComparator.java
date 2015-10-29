package classwork.patterns.comparator;

import classwork.OOP.Cat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by CCowalsky on 29.10.2015.
 */
public class CatComparator {
    public static void main(String[] args) {
        Cat tom = new Cat(false,5,"Tom","Green");
        Cat mur = new Cat(true,6,"Mur","White");
        Cat kat = new Cat(false,3,"kat","black");

        List<Cat> cats = new ArrayList<>();
        cats.add(tom);
        cats.add(mur);
        cats.add(kat);

        print(cats);

        Collections.sort(cats);

        print(cats);

        Collections.sort(cats,new Reversed(new SortByAge()));

    }
    public static void print(List<Cat> cats){
        cats.forEach(System.out::println);
    }
}
