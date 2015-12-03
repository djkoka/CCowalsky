package classwork.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CCowalsky on 03.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Vasya"));
        //list.add(new Object());

        Person vasya = list.get(0);
        Object o = list.get(1);

        list.add(new Emplayee("petr",10));

        Pair<Emplayee,Manager> pair = new Pair<>();

        Emplayee e = pair.key;
        Manager m = pair.value;

    }
}
