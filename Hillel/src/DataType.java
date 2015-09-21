/**
 * Created by CCowalsky on 21.09.2015.
 */
public class DataType {

    public static void main(String[] args) {
        int age = 23;
        int day = age * 365;
        int hours = day * 24;
        int secounds = hours * 3600;
        long milisec = secounds * 1000L;
        long longSec = milisec/1000;

        secounds =(int) longSec;
        secounds =(int) (milisec /1000);
//      secounds =(int) milisec / 1000; ne pravelno


        System.out.println(milisec);

        double d = 3.5;
        double df = 3.5F;
        int i = 10;
        long l = 5000000000L;
        float f = 2.5F;





    }

}
