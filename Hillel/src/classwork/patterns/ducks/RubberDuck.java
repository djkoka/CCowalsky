package classwork.patterns.ducks;

/**
 * Created by CCowalsky on 26.10.2015.
 */
public class RubberDuck extends Duck {

    @Override
    public String display() {
        return "Rubber Duck";
    }

    @Override
    public String fly() {
        return "fly no way";
    }

    @Override
    public String quack() {
        return "quack";
    }
}
