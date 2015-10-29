package classwork.patterns.ducks;

/**
 * Created by CCowalsky on 26.10.2015.
 */
public class MullardDuck extends Duck {
    public MullardDuck(){
        flyBehavior = new Fly();
        quackBehavior = new Quack();
    }

    @Override
    public String display(){
        return "mullard";
    }
}
