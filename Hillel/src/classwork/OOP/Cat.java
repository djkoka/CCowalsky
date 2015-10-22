package classwork.OOP;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by CCowalsky on 05.10.2015.
 */
public class Cat extends Animal implements Comparable<Cat>{
    public static final boolean domestic = true;
    public static final boolean predator = true;

    public String someField;

    boolean pet;
    String color;

    public Cat() {
        super("unknown", 0);
        System.out.println("in cat`s constructor");
    }

    public String getTypeName(){
        return someField;
    }

    public Cat(boolean isPet, int isAge, String isName, String isColor) {
        super(isName,isAge);
        pet = isPet;
        this.color = isColor;
    }

    @Override
    public String makeSound() {
        return "Nya";
    }

    @Override
    public String toString() {
        String result = super.toString();
        result +="Cat{" +
                "pet=" + pet +
                ", color='" + color + '\'' +
                '}';
        return result;
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        if (!(otherObject instanceof Cat)) return false;
        Cat otherCat = (Cat) otherObject;
        if (pet != otherCat.pet) return false;
        if (!color.equals(otherCat.color))return false;
        return true;
    }

    public String getSomeField() {
        return someField;
    }


    @Override
    public int compareTo(Cat o) {
        if (this.equals(o)){
            return 0;
        }
        return this.getName().compareTo(o.getName());
    }
}
