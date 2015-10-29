package classwork.patterns.ducks;

/**
 * Created by CCowalsky on 29.10.2015.
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public String fly() {
        return "I`m not flying";
    }
}
