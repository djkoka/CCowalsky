package classwork;

/**
 * Created by CCowalsky on 05.10.2015.
 */
public class Cat {
    public static final boolean domestic = true;
    public static final boolean predator = true;

    boolean pet;
    int age;
    String name;
    String color;

    public Cat() {
        System.out.println("in cat`s constructor");
    }

    public Cat(boolean isPet, int isAge, String isName, String isColor) {
        this.pet = isPet;
        this.age = isAge;
        this.name = isName;
        this.color = isColor;
    }

    //this указать экзе
/*    public void init (boolean isPet, int isAge, String isName, String isColor){
        this.pet = isPet;
        this.age = isAge;
        this.name = isName;
        this.color = isColor;
    }*/

}
