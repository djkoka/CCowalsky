package classwork.JDBC;

/**
 * Created by CCowalsky on 21.12.2015.
 */
public class SingoletonMain {
    public static void main(String[] args) {
        SingletonExample singleton = SingletonExample.getInstance();
        singleton.someValue="asd";

        SingletonExample singleton2 = SingletonExample.getInstance();
        System.out.println(singleton2.someValue);
    }
}
