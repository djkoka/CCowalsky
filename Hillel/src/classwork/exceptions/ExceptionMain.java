package classwork.exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CCowalsky on 05.11.2015.
 */
public class ExceptionMain {
    public static void main(String[] args)  {
        Integer i = null;

        System.out.println("before");
/*        nestedMethod1(i);
        System.out.println("after");*/

        try {
            System.out.println("in try block before");
            nestedMethod1(i);
            System.out.println("in try block after");
        } catch (NullPointerException e) {
            System.out.println("Error!!! something wrong: " + e.toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error!!! something else wrong: " + e.toString());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.toString());
        }


        System.out.println("after");
    }

    private static void nestedMethod1(Integer i) {
/*        List<Integer> integers = new ArrayList<>();
        integers.get(1);*/
/*
        if(true){
            throw new Exception("My exception");
        }
*/

        if(true) {
            throw new RuntimeException("my own exception");
        }
        masterMethod2(i);
    }

    private static void masterMethod2(Integer i) {
        i.toString();
    }
}
