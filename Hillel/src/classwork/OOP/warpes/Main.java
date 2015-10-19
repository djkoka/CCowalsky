package classwork.OOP.warpes;

/**
 * Created by CCowalsky on 19.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        int iPrimitive = 1;
        Integer first = iPrimitive;
        Integer secound = 1;
        Double d = 2.3;
        Byte b = 2;
        Boolean bool = false;
        System.out.println(first == secound);

        first = 129;
        secound = 129;
        System.out.println(first == secound);

        System.out.println(first.equals(secound));


        Object[] obj = new Object[5];
        obj[0]=1;
        obj[1]=new Integer(12);
        obj[2]=0;
        obj[3]=0;
        obj[4]=0;

    }
}
