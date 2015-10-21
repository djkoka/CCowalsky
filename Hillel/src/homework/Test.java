package homework;

import classwork.OOP.Cat;
import classwork.OOP.Dog;
import classwork.OOP.Emplayce;
import classwork.OOP.Human;
import homework.hm5.hierarchy.ObjectArray;

public class Test{
    public static void main(String[] args) {
        ObjectArray oa = new ObjectArray();
        ObjectArray oa2 = new ObjectArray();
        oa2.add(1);
        oa2.add(1);
        oa2.add(1);

        oa.add("Example");
        oa.add("Example 2");
        Cat catexm = new Cat(true,3,"kuzka","Red");
        Cat cat = new Cat();
        Dog dog = new Dog("tuzick",4);
        oa.add(catexm);
        oa.add(cat);
        oa.add(dog);
        Emplayce someone = new Emplayce();
        Human human= new Emplayce();
        oa.add(someone);
        oa.add(human);
        for (int i = 0;i< oa.size();i++){
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