package classwork.patterns.ducks;

/**
 * Created by CCowalsky on 26.10.2015.
 */
public class Decoy extends Duck {

    public Decoy(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public String display() {
        return "Decoy";
    }
}
