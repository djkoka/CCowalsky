/**
 * Created by djkoka on 18.09.2015.
 */
public class AboutMyself {

    public static void main (String[] args) {

        String firstName = "Constantin";
        String lastName = "Kowalsky";

        int thisYear = 2015;
        int birthYear = 1992;
        int age;


        age = thisYear - birthYear;

        System.out.println(firstName + "\u0020" + lastName);
        System.out.println(age);


    }
}
