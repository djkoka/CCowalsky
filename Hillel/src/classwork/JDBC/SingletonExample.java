package classwork.JDBC;

/**
 * Created by CCowalsky on 21.12.2015.
 */
public class SingletonExample {
    private static SingletonExample instance = new SingletonExample();
    public String someValue;

    private SingletonExample(){

    }

    public static SingletonExample getInstance(){
        return instance;
    }
}
