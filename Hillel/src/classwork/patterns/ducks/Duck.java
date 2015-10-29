package classwork.patterns.ducks;

/**
 * Created by CCowalsky on 26.10.2015.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public String quack() {
        return quackBehavior.quack();
    }

    abstract public String display();

    public String fly() {
        return flyBehavior.fly();
    }

    public String swim() {
        return "I`m swim";
    }
}
