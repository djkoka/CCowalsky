package classwork.patterns.ducks;

/**
 * Created by CCowalsky on 26.10.2015.
 */
public class Lake {
    public static void main(String[] args) {
        Duck pilot = new RubberDuck();
        pilot.flyBehavior = new Jet();
        //test(pilot)
    }

/*    private static Duck test() {
        Duck duck = ();
        System.out.println(duck.quack());
        System.out.println(duck.fly());
        System.out.println(duck.display());
        return duck;
    }*/
}
