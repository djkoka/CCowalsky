package classwork.OOP;

/**
 * Created by CCowalsky on 05.10.2015.
 */
public class Cat extends Animal{
    public static final boolean domestic = true;
    public static final boolean predator = true;

    boolean pet;
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

        System.out.println("in cat`s");
        if (!(otherObject instanceof Cat)) return false;

        Cat otherCat = (Cat) otherObject;

        if (pet != otherCat.pet) return false;
        if (age != otherCat.age) return false;
        if (!name.equals(otherCat.name)) return false;
        if (!color.equals(otherCat.color))return false;
        return true;
    }


    //this указать экзе
/*    public void init (boolean isPet, int isAge, String isName, String isColor){
        this.pet = isPet;
        this.age = isAge;
        this.name = isName;
        this.color = isColor;
    }*/

}
