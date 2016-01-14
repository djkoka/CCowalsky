package classwork.java8features;

/**
 * Created by CCowalsky on 14.01.2016.
 */
public class RedFilter implements Filtrator {
    @Override
    public boolean test(Apple apple) {
        return apple.getColors().equals("red");
    }
}
