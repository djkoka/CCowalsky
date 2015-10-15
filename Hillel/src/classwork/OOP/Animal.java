package classwork.OOP;

import java.util.Arrays;

/**
 * Created by CCowalsky on 08.10.2015.
 */
public abstract class Animal implements Vaccinable {
    public String someField = "Animal`s field";
    private String name;
    private int age;
    private String[] vaccines = new String[3];
    private int vaccineCouner = 0;

    public String getTypeName(){
        return someField;
    }

    public Animal (String name, int age){
        this.name=name;
        this.age=age;

    }

    public void  vaccines(String vaccine){
        vaccines[vaccineCouner]=vaccine;
        vaccineCouner++;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (vaccineCouner != animal.vaccineCouner) return false;
        if (name != null ? !name.equals(animal.name) : animal.name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(vaccines, animal.vaccines);

    }


    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (vaccines != null ? Arrays.hashCode(vaccines) : 0);
        result = 31 * result + vaccineCouner;
        return result;
    }

    public String toString() {

        String result = "name='" + name;
        result+="age=" + age;
        result+="vaccines=" + Arrays.toString(vaccines);


        return result;

    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSomeField() {
        return someField;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public abstract String makeSound();/*{
        return "noise";

    }*/
}
