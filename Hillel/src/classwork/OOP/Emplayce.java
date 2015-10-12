package classwork.OOP;

import java.util.Arrays;

/**
 * Created by CCowalsky on 12.10.2015.
 */
public class Emplayce extends Human implements Vaccinable{
    private String position;
    private String[] vaccines = new String[3];
    private int vaccineCouner = 0;

    public void  vaccines(String vaccine){
        vaccines[vaccineCouner]=vaccine;
        vaccineCouner++;
    }

    @Override
    public String toString() {
        return "Emplayce{" +
                "position='" + position + '\'' +
                ", vaccines=" + Arrays.toString(vaccines) +
                ", vaccineCouner=" + vaccineCouner +
                '}';
    }
}
