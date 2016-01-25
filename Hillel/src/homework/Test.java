package homework;

import classwork.OOP.Cat;
import classwork.OOP.Dog;
import classwork.OOP.Emplayce;
import classwork.OOP.Human;
import homework.hm5.hierarchy.ObjectArray;

import java.util.*;

public class Test {


    public static int min(int a, int b, int c) {
        int min = 0;
        if (a < b & a < c) {
            min = a;
        }
        if (b < a & b < c) {
            min = b;
        } else min = c;
        return min;
    }
    public static class Person {
        String name;

        public Person(String personName) {
            name = personName;
        }



        public String greet(String yourName) {
            return String.format("Hi %s, my name is %s", name, yourName);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new Person(""));
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(10, 5, 10));
    }

    public static void test1() {
        ObjectArray oa = new ObjectArray();
        ObjectArray oa2 = new ObjectArray();
        oa2.add(1);
        oa2.add(1);
        oa2.add(1);

        oa.add("Example");
        oa.add("Example 2");
        Cat catexm = new Cat(true, 3, "kuzka", "Red");
        Cat cat = new Cat();
        Dog dog = new Dog("tuzick", 4);
        oa.add(catexm);
        oa.add(cat);
        oa.add(dog);
        Emplayce someone = new Emplayce();
        Human human = new Emplayce();
        oa.add(someone);
        oa.add(human);
        for (int i = 0; i < oa.size(); i++) {
            System.out.println(oa.get(i));
        }
        System.out.println(oa.contains("Example"));
        System.out.println(oa.contains(System.in));
        System.out.println(oa.size());
        oa.remove(4);
        System.out.println(oa.size());
        System.out.println(oa2.size());
        System.out.println(oa.equals(oa2));

        }
    }
