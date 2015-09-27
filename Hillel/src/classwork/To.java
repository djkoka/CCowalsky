package classwork;

/**
 * Created by CCowalsky on 21.09.2015.
 */
public class To {

    public static void main (String[] args){

        sayHello();

        int age = 23;


        age = someMethod(age);

        System.out.println(age);


        int kAge = getkAge();

        print(kAge);


    }

    private static int someMethod(int age) {
        System.out.println(age);
        age = 50;
        return age;
    }


    private static int getkAge() {
        int kAge = calAge(1992);

        System.out.println(kAge);

        int jAge = calAge(1991);

        System.out.println(jAge);
        return kAge;
    }

    private static void print(int kAge) {
        System.out.println ("I`m "+kAge+" age");
        System.out.println ("31"+ 31);
        System.out.println (31+ 31);
    }


    public static void sayHello(){
        String hm = "Hello world";
        System.out.println(hm);

    }


    public static int calAge(){
        final int birthYear = 1992;

        int year = 2015;
        int age = year - birthYear;
        return age;

    }


    public static int calAge(int birthYear){

        int year = 2015;
        int age = year - birthYear;
        return age;

    }




}