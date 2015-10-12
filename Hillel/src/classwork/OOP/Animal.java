package classwork.OOP;

import java.util.Arrays;

/**
 * Created by CCowalsky on 08.10.2015.
 */
public abstract class Animal implements Vaccinable {
    String name;
    int age;
    private String[] vaccines = new String[3];
    private int vaccineCouner = 0;

    public void  vaccines(String vaccine){
        vaccines[vaccineCouner]=vaccine;
        vaccineCouner++;
    }


    public String toString() {

        String result = "name='" + name;
        result+="age=" + age;
        result+="vaccines=" + Arrays.toString(vaccines);


        return result;
    }

    public abstract String makeSound();/*{
        return "noise";

    }*/
}
