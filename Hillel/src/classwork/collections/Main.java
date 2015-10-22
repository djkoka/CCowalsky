package classwork.collections;

import classwork.OOP.Animal;
import classwork.OOP.Cat;
import classwork.OOP.Emplayce;
import classwork.OOP.Kitty;

import java.util.*;

/**
 * Created by CCowalsky on 22.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Collection<Cat> cats = new LinkedList<>();

        cats.add(new Cat(false, 4, "tom", "black"));

        someMethod(cats);

        //System.out.println(cats.get(0));

        Set<Cat> catSet = new TreeSet<>();

        catSet.add(new Cat(false,4,"tom","black"));
        catSet.add(new Cat(false,4,"mot","black"));
        catSet.add(new Cat(false,4,"omt","black"));
        catSet.add(new Cat(false, 4, "tmo", "black"));

        System.out.println(catSet.size());

        System.out.println("Sorted cats: ");
        for (Cat cat: catSet){
            System.out.println(cat);
        }

    }

    private static void someMethod(Collection<Cat> cats) {
        for (Cat cat: cats){
            System.out.println(cat);
        }
        cats.forEach(System.out::println);
    }

    private static void genericAndCollections() {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat(false,4,"tom","black"));
        cats.add(new Kitty(false,1,"tom","black"));


        Cat cat = cats.get(0);
        //Kitty kitty =  cats.get(1);
        Object o = cats.get(1);
        Animal animal = cats.get(1);
    }

    private static void rawList() {
        ArrayList list = new ArrayList();
        list.add(new Cat(false,4,"tom","block"));
        list.add(10);
        list.add("word");

        for(Object o : list){
            System.out.println(o);
        }

        // list.forEach(System.out::println);

        Cat cat = (Cat) list.get(0);
        Integer integer = (Integer) list.get(1);
        String s = (String) list.get(2);
    }
}
