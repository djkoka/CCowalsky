package classwork;

/**
 * Created by CCowalsky on 21.09.2015.
 */
public class DataType {

    public static void main(String[] args) {

        byte b = 120;
        short s = b;
        long l = s;

        double d = l;

        l = 15;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("integer max value " + maxValue);
        long intmaxValue = maxValue;
        long intOverflow = intmaxValue + 1;

//      Integer.prest

        int i = (int) intOverflow;
        System.out.println(i);

        d = Math.PI;
        i = (int) d;
        System.out.println(i);

        i = (int) 3.9;
        System.out.println(i);


    }

    private static void realNumberCarp() {
        if (1.1 + 2.2 == 3.3) {
            System.out.println("they are ravnu");
        } else {
            System.out.println(" they are not ravno");
        }
    }

    private static void primitiDataType() {
        int age = 23;
        int day = age * 365;
        int hours = day * 24;
        int secounds = hours * 3600;
        long milisec = secounds * 1000L;
        long longSec = milisec / 1000;

        secounds = (int) longSec;
        secounds = (int) (milisec / 1000);
//      secounds =(int) milisec / 1000; ne pravelno


        System.out.println(milisec);

        double d = 3.5;
        double df = 3.5F;
        int i = 10;
        long l = 5000000000L;
        float f = 2.5F;


        boolean boal = true;
        boal = false;


        char c = 'h';

        byte dfs = 125;
    }

}
