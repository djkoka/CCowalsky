package classwork.patterns.ducks;

/**
 * Created by CCowalsky on 26.10.2015.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quick();
    }

    @Override
    public String display() {
        return "Rubber Duck";
    }
}