package classwork.patterns.iterator;

import classwork.OOP.Cat;
import classwork.collections.LinkinListEterator;
import classwork.collections.RecursivedLinkinList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by CCowalsky on 29.10.2015.
 */
public class MainIterator {
    public static void main(String[] args) {
        Cat tom = new Cat(false, 5, "Tom", "Green");
        Cat mur = new Cat(true, 6, "Mur", "White");
        Cat kat = new Cat(false, 3, "kat", "black");

        RecursivedLinkinList cats = new RecursivedLinkinList();
        cats.add(tom);
        cats.add(mur);
        cats.add(kat);

        Iterator iterator = new LinkinListEterator(cats);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        List someList = new ArrayList<>();
        for (Object o : cats){
            System.out.println(o);
        }
    }
}
